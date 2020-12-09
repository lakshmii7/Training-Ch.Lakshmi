package com.mvc;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



	public class PatientLoginController extends HttpServlet {
		public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			PatientLoginBean lb=new PatientLoginBean();
			lb.setEmail(email);
			lb.setPassword(password);
	       HttpSession hs=request.getSession();
	       hs.setAttribute("bean",lb );
	       boolean status=false;
	       try {
	    	   status=lb.loginValidate(email,password);
	       }  catch (Exception e) {
	    	   e.printStackTrace();
	       }
	       if(status) {
	    	   response.sendRedirect("./patient_home.html");
	    	   
	       }
	       else {
	    	   response.sendRedirect("./patient_login.html");
	       }
		}

	}


