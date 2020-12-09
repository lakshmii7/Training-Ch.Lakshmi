package com.mvc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEx {
	public static Connection Connectivity() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/kims";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		return con;
	}
}
