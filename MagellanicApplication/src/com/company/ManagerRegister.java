package com.company;

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
public class ManagerRegister extends HttpServlet {
	Connection con=null;
	PreparedStatement ps=null;
	 public void init(ServletConfig config) { 
    	try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	}catch (ClassNotFoundException e) {
    		e.printStackTrace(); }
    	String url="jdbc:mysql://localhost:3306/mgcloud";
    	String username="root";
    	String password="root";
    	try {
    	con=DriverManager.getConnection(url,username,password);
    	} catch(SQLException e ) {
    		e.printStackTrace(); }}
    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException   {
		String mname=request.getParameter("mname");
    String email=request.getParameter("email");
	String password=request.getParameter("password");
	int phone=Integer.parseInt(request.getParameter("phone"));
	int salary=Integer.parseInt(request.getParameter("salary"));
	int experience=Integer.parseInt(request.getParameter("experience"));
	String gender=request.getParameter("gender");
	String designation=request.getParameter("designation");
	PrintWriter pw=response.getWriter();
	String sql="insert into manager(mname,email,password,phone,salary,experience,gender,designation) values(?,?,?,?,?,?,?,?)";
	try {	
	ps=con.prepareStatement(sql);
	ps.setString(1, mname);
	ps.setString(2, email);
	ps.setString(3,password);
	ps.setInt(4,phone);
	ps.setInt(5,salary);
	ps.setInt(6,experience);
	ps.setString(7,gender);
	ps.setString(8,designation);
	int x=ps.executeUpdate();
	if(x!=0) 
		response.sendRedirect("./manager_login.html?msg=registered");
		else 
			response.sendRedirect("./manager_register.html?msg=failed");
    
	} catch(SQLException e) {
		e.printStackTrace();
	} }} 
	

