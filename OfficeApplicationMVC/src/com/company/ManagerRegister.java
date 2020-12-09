package com.company;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ManagerRegister extends HttpServlet {
	
	 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
	    String email=request.getParameter("email");
		String password=request.getParameter("password");
		int phone=Integer.parseInt(request.getParameter("phone"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		int experience=Integer.parseInt(request.getParameter("experience"));
		String gender=request.getParameter("gender");
		String designation=request.getParameter("designation");
	ManagerRegisterBean mb=new ManagerRegisterBean();
	mb.setName(name);
	mb.setEmail(email);
	mb.setPassword(password);
	mb.setPhone(phone);
	mb.setSalary(salary);
	mb.setExperience(experience);
	mb.setGender(gender);
	mb.setDesignation(designation);
	
	HttpSession hs=request.getSession();
	hs.setAttribute("mbean", mb);
	boolean status=false;
	try {
		status=mb.register(name,email,password,phone,salary,experience,gender,designation);
	} catch(Exception e) {
		e.printStackTrace();
	}
	if(status)
		response.sendRedirect("./manager_login.html?msg=registered successfully");
	else
		response.sendRedirect("./manager_home.html?msg=register failed");
}

	}

