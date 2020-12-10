package com.company;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ViewLeaveBean {
	private int id;
	private String ename,email;
	private int phone;
	private String gender, no_of_days, date_of_leave, designation;
	private int eid;
	private String mname,status;
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNo_of_days() {
		return no_of_days;
	}
	public void setNo_of_days(String no_of_days) {
		this.no_of_days = no_of_days;
	}
	public String getDate_of_leave() {
		return date_of_leave;
	}
	public void setDate_of_leave(String date_of_leave) {
		this.date_of_leave = date_of_leave;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	} 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public List<ViewLeaveBean> view(String designation) throws Exception {
		Connection con=ConnectionEst.Connectivity();
		PreparedStatement ps =con.prepareStatement("select * from leaves where designation=?");
		ps.setString(1,designation);
		ResultSet rs = ps.executeQuery();
		List<ViewLeaveBean> l=new ArrayList<>();
		while(rs.next()) {
			ViewLeaveBean lab=new ViewLeaveBean();
			lab.setid(rs.getInt(1));
			lab.setEname(rs.getString(2));
			lab.setEmail(rs.getString(3));
			lab.setPhone(rs.getInt(4));
			lab.setGender(rs.getString(5));
			lab.setNo_of_days(rs.getString(6));
			lab.setDate_of_leave(rs.getString(7));
			lab.setDesignation(rs.getString(8));
			lab.setStatus(rs.getString(11));
			lab.setMname(rs.getString(10));
			lab.setEid(rs.getInt(9));
			l.add(lab);
		}
		return l;
	}
	
	public int details(int id) throws Exception{
		Connection con=ConnectionEst.Connectivity();
		PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
		ps.setInt(1,id);
		ResultSet rs1=ps.executeQuery();
		if(rs1.next()){
			return rs1.getInt("no_of_leaves_taken");
		}
		return 0;
	}
}


