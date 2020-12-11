package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PatientRegisterBean {
private int id;
private String name;
private int age;
private String gender,address;
private long phonenumber;
private String email,password;

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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
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
public long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(long phonenumber ) {
	this.phonenumber =phonenumber ;
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



public boolean register(String name, int age, String gender, String address,String phonenumber, String email, String password) throws Exception  {
	Connection con=ConnectionEx.Connectivity();
	String sql="insert into patient(name,age,gender,address,phonenumber,email,password) values(?,?,?,?,?,?,?)";
	PreparedStatement ps=con.prepareStatement(sql);	
	ps=con.prepareStatement(sql);
	ps.setString(1, name);
	ps.setInt(2,age );
	ps.setString(3,gender);
	ps.setString(4,address);
	ps.setString(5,phonenumber);
	ps.setString(6,email);
	ps.setString(7, password);
	int x=ps.executeUpdate();
	if(x!=0)
		return true;
	else
		return false;	
}
 
}

