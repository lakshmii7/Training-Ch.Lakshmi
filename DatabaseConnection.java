package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		if(con!=null) {
			System.out.println("Connection established");
		}
      Statement st=con.createStatement();
      int x=st.executeUpdate("create table student(sid int(10),name varchar(50),marks int(10),section varchar(50))");
      if(x==0) 
    	  System.out.println("table created");
	}

}
