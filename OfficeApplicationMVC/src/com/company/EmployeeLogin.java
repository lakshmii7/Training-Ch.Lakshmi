package com.company;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class EmployeeLogin extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		EmployeeRegisterBean eb=null;
		try {
			eb=new EmployeeLoginBean().login(email,password);
		}catch (Exception e) {
			e.printStackTrace();
		}
		HttpSession hs=request.getSession();
		if(eb!=null) {
			hs.setAttribute("employeeDetails", eb);
			hs.setAttribute("id", eb.getId());
			hs.setAttribute("leaves", eb.getNo_of_leaves_taken());
			response.sendRedirect("./employee_home.html?msg=login successfully");
		}
		else 
			response.sendRedirect("./employee_login.html?msg=login failed");
		}
	}


