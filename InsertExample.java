package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mysql";
		String username="root";
		String password="root";
		Connection con=DriverManager.getConnection(url, username, password);
		if(con!=null) 
			System.out.println("Connection established");
		Statement st=con.createStatement();
		System.out.println("enter no of students:");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter FirstName:");
			String name=sc.next();
			System.out.println("enter LastName:");
			name+=" "+sc.next();
			System.out.println("enter Marks:");
			int marks=sc.nextInt();
			System.out.println("Enter Section:");
			String section=sc.next();
			String insert="insert into student values("+id+",'"+name+"',"+marks+",'"+section+"')";
			int x=st.executeUpdate(insert);
			if(x!=0)
				System.out.println("inserted");
		}
	}

}
