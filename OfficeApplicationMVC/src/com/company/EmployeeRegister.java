package com.company;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class EmployeeRegister extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ename=request.getParameter("ename");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int phone=Integer.parseInt(request.getParameter("phone"));
		int salary=Integer.parseInt(request.getParameter("salary"));
		String designation=request.getParameter("designation");
		String gender=request.getParameter("gender");
		int no_of_leaves_taken=Integer.parseInt(request.getParameter("no_of_leaves_taken"));
		EmployeeRegisterBean eb=new EmployeeRegisterBean();
		eb.setEname(ename);
		eb.setEmail(email);
		eb.setPassword(password);
		eb.setPhone(phone);
		eb.setSalary(salary);
		eb.setDesignation(designation);
		eb.setGender(gender);
		eb.setNo_of_leaves_taken(no_of_leaves_taken);
		HttpSession hs=request.getSession();
		hs.setAttribute("ebean", eb);
		boolean status=false;
		try {
			status=eb.register(ename ,email,password, gender,designation, phone, salary,no_of_leaves_taken);
		} catch(Exception e) {
			e.printStackTrace();
		}
		if(status)
			response.sendRedirect("./employee_login.html?msg=registered successfully");
		else
			response.sendRedirect("./employee_home.html?msg=register failed");
	}
}