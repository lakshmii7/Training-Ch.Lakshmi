package com.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoctorRegisterCon extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	public void intit(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/kims";
		String username="root";
    	String password="root";
    	try {
    	con=DriverManager.getConnection(url,username,password);
    	} catch(SQLException e ) {
    		e.printStackTrace(); }}	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException   {
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String specialisation=request.getParameter("specialisation"); 
		boolean status=false;
		DoctorRegisterBean bs=new DoctorRegisterBean();
		
		bs.setName(name);
		bs.setPassword(password);
		bs.setEmail(email);
		bs.setPhone(mobile);
		bs.setSpecialisation(specialisation);
		try {
	   status=bs.register(name,password,email,mobile,specialisation);
		} catch(Exception e) {
			e.printStackTrace();
		}
	    if(status)
		response.sendRedirect("./doctor_login.html?msg=registered successfully");
	   else 
		  response.sendRedirect("./doctor_register.html?msg=registered failed");
	    	
	     
		
		}
	}


