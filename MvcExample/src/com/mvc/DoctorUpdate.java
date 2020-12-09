package com.mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class DoctorUpdate extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		long mobile=Long.parseLong(phone);
		String specialisation=request.getParameter("specialisation"); 
		boolean status=false;
		DoctorUpdateBean ub=new DoctorUpdateBean();
		ub.setId(id);
		ub.setName(name);
		ub.setPassword(password);
		ub.setEmail(email);
		ub.setPhone(mobile);
		ub.setSpecialisation(specialisation);
		HttpSession hs=request.getSession();
		DoctorRegisterBean rb=null;
		try {
	   rb=ub.update(id,name,password,email,mobile,specialisation);
		} catch(Exception e) {
			e.printStackTrace();
		}
	    if(rb!=null) {
	    		hs.setAttribute("doctorDetails", rb);
		response.sendRedirect("./doctor_profile.jsp?msg=registered successfully");
	    } else 
		  response.sendRedirect("./update_doctor_profile.jsp?msg=registered failed");
	    	
	     
		
		}
	



	
	}


