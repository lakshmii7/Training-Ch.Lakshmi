package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Subquery {
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
  String subquery1="select * from customers where cid not in (select oid from orders)";
 ResultSet rs=st.executeQuery(subquery1);
  System.out.println("Id  || Customer Name");
  while(rs.next()) {
	  System.out.println(rs.getInt(1)+"  "+rs.getString(2));
  }
}
}
