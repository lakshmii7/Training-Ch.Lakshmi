package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeLoginBean {
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
public  EmployeeRegisterBean login(String email,String password) throws Exception {
	Connection con=ConnectionEst.Connectivity();
	String sql="select * from employee where email=? and password=?";
	PreparedStatement ps=con.prepareStatement(sql);
	
	ps.setString(1,email);
	ps.setString(2,password);
	ResultSet rs=ps.executeQuery();
	EmployeeRegisterBean eb=new EmployeeRegisterBean();
	if(rs.next()) {
		eb.setId(rs.getInt(1));
		eb.setEname(rs.getString(2));
		eb.setEmail(rs.getString(3));
		eb.setPassword(rs.getString(4));
		eb.setGender(rs.getString(5));
		eb.setDesignation(rs.getString(6));
		eb.setPhone(rs.getInt(7));
		eb.setSalary(rs.getInt(8));
		eb.setNo_of_leaves_taken(rs.getInt(9));
		return eb;
	}
	else
		return null;
	
		
}	

}
