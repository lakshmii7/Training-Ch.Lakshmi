package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeRegisterBean {
private String ename,email,password,gender,designation;
private int id,phone,salary,no_of_leaves_taken;
public String getEname() {
	return ename;
}
public void setEname(String Ename) {
	this.ename = Ename;
}
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

public int getNo_of_leaves_taken() {
	return no_of_leaves_taken;
}
public void setNo_of_leaves_taken(int no_of_leaves_taken) {
	this.no_of_leaves_taken = no_of_leaves_taken;
}
public boolean register(String ename,String email,String password,String gender,String designation,int Phone,int Salary,int no_of_leaves_taken) throws Exception {
	Connection con=ConnectionEst.Connectivity();
	String sql="insert into employee(ename,email,password,gender,phone,salary,no_of_leaves_taken)";
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setString(1, ename);
	ps.setString(2, email);
	ps.setString(3,password);
	ps.setInt(6,phone);
	ps.setInt(7,salary);
	ps.setString(5,designation);
	ps.setString(4,gender);
	ps.setInt(8, no_of_leaves_taken);
	int x=ps.executeUpdate();
   
    if(x!=0) {
    	return true;
    }  else {
    	return false;
    }
}

}
