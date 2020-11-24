package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JoinExample {
public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/mysql";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, username, password);
	if(con!=null) {
		System.out.println("Connection established");
	}
  Statement st=con.createStatement();
  String subquery="select c.cid,c.cname,o.oid from customers c join orders o where c.cid=o.oid";
  ResultSet rs=st.executeQuery(subquery);
  System.out.println("Id || Customer Name  || Order id");
  while(rs.next()) {
	  System.out.println(rs.getInt(1)+"  || "+rs.getString(2)+"  || "+rs.getInt(3));
  }
}
}
