package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LikeExample {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/mysql";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, username, password);
	if(con!=null) {
		System.out.println("Connection established");
	
  Statement st=con.createStatement();
  String subquery="select name from student where name like '_a%'";
  ResultSet rs=st.executeQuery(subquery);
  System.out.println("Student Name using  _xyz%");
  while(rs.next()) {
	  System.out.println(rs.getString(1));
  }
  String subquery1="select name from student where name like 'a%'";
  rs=st.executeQuery(subquery1);
  System.out.println("Student name using xyz%");
  while(rs.next()) {
	  System.out.println(rs.getString(1));
  }
  String subquery2="select name from student where name like '%a'";
  rs=st.executeQuery(subquery2);
  System.out.println("Student name using %xyz");
  while(rs.next()) {
	  System.out.println(rs.getString(1));
  }
  String subquery3="select name from student where name like '%a%'";
  rs=st.executeQuery(subquery3);
  System.out.println("Student name using %xyz%");
  while(rs.next()) {
	  System.out.println(rs.getString(1));
  }
}
}
}
