package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ManagerRegisterBean {
private int id;
private String name,email,password,gender,designation;
private int phone,salary,experience;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public boolean register(String name,String email,String password,int phone,int salary,int experience, String gender,String designation) throws Exception {
Connection con=ConnectionEst.Connectivity();
String sql="insert into manager(name,email,password,phone,salary,experience,gender,designation)";
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, email);
ps.setString(3,password);
ps.setInt(4,phone);
ps.setInt(5,salary);
ps.setInt(6,experience);
ps.setString(7,gender);
ps.setString(8,designation);
int x=ps.executeUpdate();
if(x!=0) 
{
	return true;
}  else {
	return false;
}
}
}
