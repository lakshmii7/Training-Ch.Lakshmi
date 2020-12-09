package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ManagerLoginBean {
private String email,password;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
public  ManagerRegisterBean login(String email,String password) throws Exception {
	Connection con=ConnectionEst.Connectivity();
	String sql="select * from manager where email=? and password=?";
	PreparedStatement ps=con.prepareStatement(sql);
	
	ps.setString(1,email);
	ps.setString(2,password);
	ResultSet rs=ps.executeQuery();
	ManagerRegisterBean mb=new ManagerRegisterBean();
	if(rs.next()) {
		mb.setName(rs.getString(1));
		mb.setEmail(rs.getString(2));
		mb.setPassword(rs.getString(3));
		mb.setPhone(rs.getInt(4));
		mb.setSalary(rs.getInt(5));
		mb.setExperience(rs.getInt(6));
		mb.setGender(rs.getString(7));
		mb.setDesignation(rs.getString(8));
		return mb;
		}
		else
			return null;
		
			
	}	
	}

