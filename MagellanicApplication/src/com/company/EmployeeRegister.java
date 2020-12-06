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
public class EmployeeRegister extends HttpServlet {
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
	String ename=request.getParameter("ename");
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	int phone=Integer.parseInt(request.getParameter("phone"));
	int salary=Integer.parseInt(request.getParameter("salary"));
	String designation=request.getParameter("designation");
	String gender=request.getParameter("gender");
	int no_of_leaves_taken=Integer.parseInt(request.getParameter("no_of_leaves_taken"));
	PrintWriter pw=response.getWriter();
	String sql="insert into employee(ename,email,password,phone,salary,designation,gender,no_of_leaves_taken) values(?,?,?,?,?,?,?,?)";
	try {	
	ps=con.prepareStatement(sql);
	ps.setString(1, ename);
	ps.setString(2, email);
	ps.setString(3,password);
	ps.setInt(4,phone);
	ps.setInt(5,salary);
	ps.setString(6,designation);
	ps.setString(7,gender);
	ps.setInt(8, no_of_leaves_taken);
	int x=ps.executeUpdate();
   
    if(x!=0) 
    	response.sendRedirect("./employee_login.html?msg=registered");
    else
    	response.sendRedirect("./employee_register.html?msg=registered");
    	
    
	} catch(SQLException e) {
		e.printStackTrace();
	}}	}

