package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PatientRegisterBean {
private String name,email,password,gender,address,phonenumber;
private int age;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

public boolean register(String name, int age, String gender, String address, String email, String password,String phonenumber) throws Exception  {
	Connection con=ConnectionEx.Connectivity();
	String sql="insert into patient(name,email,password,gender,addresss,phonenumber,age) values(?,?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);	
	ps=con.prepareStatement(sql);
	ps.setString(1, name);
	ps.setString(2, email);
	ps.setString(3,password);
	ps.setString(4,gender);
	ps.setString(5, address);
	ps.setString(6,phonenumber);
	ps.setInt(7, age);
	int x=ps.executeUpdate();
	if(x!=0)
		return true;
	else
		return false;	
}

	
}


