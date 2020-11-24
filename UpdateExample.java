package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateExample {
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
      System.out.println("where to update:\n1.name:\n2.marks\n3.section using id:");
	 int choice=sc.nextInt();
	 if(choice==1) {
		 System.out.println("enter Name:");
		 String name=sc.next();
		 name+= " "+sc.next();
		 System.out.println("enter id");
		 int id=sc.nextInt();
		 
		
		 String update="update table student set name='" +name + "' where sid =" + id;
		 int x=st.executeUpdate(update);
		 if(x!=0)
			 System.out.println("updated");
	 }else if(choice==2) {
		 System.out.println("enter how many marks should update  for one student");
		 int increment=sc.nextInt();
		 System.out.println("enter id:");
		 int id=sc.nextInt();
		 String update="update table student set marks=marks+" +increment+" where sid="+id;
		 
		 int x=st.executeUpdate(update);
		 if(x==0)
			 System.out.println("updated");
	 }else if(choice==3)
	 {
		 System.out.println("enter section");
		 String section=sc.next();
		 System.out.println("enter id");
		 int id=sc.nextInt();
		 String update ="update table student set section='" +section + "' where sid=" + id;
		 int x=st.executeUpdate(update);
		 if(x==0)
			 
			 System.out.println("updated");
	
	 }else {
		 System.out.println("enter ur option in between 1 to n");
	 }
	
	
	}

}
