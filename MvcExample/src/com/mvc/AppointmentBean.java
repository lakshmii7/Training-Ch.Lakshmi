package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AppointmentBean {
	private int id;
private String patient_name,email,gender,blood_group,specialist,date_of_appointment,time_of_appointment,status;
private int phonenumber;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPatient_name() {
	return patient_name;
}
public void setPatient_name(String patient_name) {
	this.patient_name = patient_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getBlood_group() {
	return blood_group;
}
public void setBlood_group(String blood_group) {
	this.blood_group = blood_group;
}
public String getSpecialist() {
	return specialist;
}
public void setSpecialist(String specialist) {
	this.specialist = specialist;
}
public String getDate_of_appointment() {
	return date_of_appointment;
}
public void setDate_of_appointment(String date_of_appointment) {
	this.date_of_appointment = date_of_appointment;
}
public String getTime_of_appointment() {
	return time_of_appointment;
}
public void setTime_of_appointment(String time_of_appointment) {
	this.time_of_appointment = time_of_appointment;
}
public int getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}


public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public  boolean apply(String patient_name,String email,String gender,String blood_group,String specialist,String date_of_appointment,String time_of_appointment,int phonenumber) throws Exception {
Connection con=ConnectionEx.Connectivity();
PreparedStatement ps=con.prepareStatement("insert into  appointment(patient_name,email,blood_group,specialist,date_of_aappointment,time_of_appointment,phonenumber,id");
ps.setString(1,patient_name);
ps.setString(2, email);
ps.setString(3, gender);
ps.setString(4, blood_group);
ps.setString(5, specialist);
ps.setString(6, date_of_appointment);
ps.setString(7, time_of_appointment);
ps.setInt(8, phonenumber);
ps.setInt(9, id);
	int x=ps.executeUpdate();
	if(x!=0)
		return true;
	else 
		return false;
}
public List<AppointmentBean> status(int id) throws Exception {
	Connection con=ConnectionEx.Connectivity();
	PreparedStatement ps=con.prepareStatement("select * from appointment where pid=?");
	ps.setInt(1,id);
	ResultSet rs=ps.executeQuery();
	ArrayList<AppointmentBean> l=new ArrayList<>();
	while(rs.next()){
		AppointmentBean ab=new AppointmentBean();
		ab.setPatient_name(rs.getString(2));
		ab.setPhonenumber(rs.getInt(3));
		ab.setEmail(rs.getString(4));
		ab.setGender(rs.getString(5));
		ab.setBlood_group(rs.getString(6));
		ab.setSpecialist(rs.getString(7));
		ab.setDate_of_appointment(rs.getString(8));
		ab.setTime_of_appointment(rs.getString(9));
		ab.setStatus(rs.getString(10));
		l.add(ab);
	}
	return l;
}
}


