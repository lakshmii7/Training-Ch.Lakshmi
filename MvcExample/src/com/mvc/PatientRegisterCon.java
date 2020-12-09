package com.mvc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PatientRegisterCon extends HttpServlet {
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
	
public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException	{
	
	String name=request.getParameter("name");
	int age=Integer.parseInt(request.getParameter("age"));
	String gender=request.getParameter("gender");
	String address=request.getParameter("address");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
   String phonenumber=request.getParameter("phonenumber");
    long mobile=Long.parseLong(phonenumber);
	boolean status=false;
	PatientRegisterBean bp=new PatientRegisterBean();
	
	bp.setName(name);
	bp.setAge(age);
	bp.setGender(gender);
	bp.setAddress(address);
	bp.setEmail(email);
	bp.setPassword(password);
	bp.setPhonenumber(phonenumber);
	
	try {
   status=bp.register(name,age,gender,address,email,password,phonenumber);
	} catch(Exception e) {
		e.printStackTrace();
	}
    if(status)
	response.sendRedirect("./patient_login.html?msg=registered successfully");
   else 
	  response.sendRedirect("./patient_register.html?msg=registered failed");
    	
}    
}
	