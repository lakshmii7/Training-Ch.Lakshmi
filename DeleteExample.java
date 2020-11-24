package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteExample {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/mysql";
	String username="root";
	String password="root";
	Connection con=DriverManager.getConnection(url, username, password);
	if(con!=null) {
		System.out.println("Connection established");
	}
  Statement st=con.createStatement();
  System.out.println("Delete for 1.Single or 2.multipe");
  int choice=sc.nextInt();
  if(choice==1) {
	  System.out.println("enter your id:");
	  int id=sc.nextInt();
	  String delete="delete from student  where sid="+id;
	  int x=st.executeUpdate(delete);
	  if(x!=0)
		  System.out.println("deleted");
  }else if(choice==2) {
	  System.out.println("enter no of students:");
	  int size=sc.nextInt();
	  System.out.println("enter student ids:");
	  String ids="";
	  for(int i=0;i<size;i++) {
		  ids+=","+sc.next();
		  
	  }
	  ids=ids.substring(1, ids.length());
	  String delete="delete from student where sid in("+ids+")";
	  int x=st.executeUpdate(delete);
	  if(x!=0)
System.out.println("deleted");
	  }else {
		  System.out.println("enter your choice in given menu");
	  }
  
}
}
