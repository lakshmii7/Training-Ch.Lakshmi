package com.mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorUpdateBean {
		private int id;
	private String name,password,email,specialisation;
		private long phone;
		
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSpecialisation() {
			return specialisation;
		}
		public void setSpecialisation(String specialisation) {
			this.specialisation = specialisation;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		public DoctorRegisterBean update(int id,String name,String password,String email,long phone,String specialisation) throws Exception  {
			Connection con=ConnectionEx.Connectivity();
			String sql="update doctor set name=?,password=?,email=?,phone=?,specialisation=?) where id=?";
			PreparedStatement ps=con.prepareStatement(sql);	
			ps.setString(1, name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setLong(4,phone);
			ps.setString(5, specialisation);
			ps.setInt(6,id);
			int x=ps.executeUpdate();
			DoctorRegisterBean rb=new DoctorRegisterBean();
			if(x!=0) {
				sql="select * from doctor where id=?";
						ps=con.prepareStatement(sql);
						ps.setInt(1, id);
						ResultSet rs=ps.executeQuery();
						if(rs.next()) {
							rb.setId(rs.getInt("id"));
							rb.setName(rs.getString("name"));
							rb.setPassword(rs.getString("password"));
					       rb.setEmail(rs.getString("email"));
							rb.setPhone(rs.getLong("phonenumber"));
							rb.setSpecialisation(rs.getString("specialisation"));
							return rb;
						}else {
							return  null;
							
						}
 			}else 
 				return null;
}
}

	
