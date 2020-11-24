package com.jnit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AlterExample {

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
      System.out.println("1.change column\n2.add column\n3.drop column");
	 int choice=sc.nextInt();
	 if(choice==1) {
		 System.out.println("enter the old colname:");
		 String oldColName=sc.next();
		 System.out.println("enter the new colname");
		 String newColName=sc.next();
		 System.out.println("enter the datatype of new  colname");
		 String datatype=sc.next();
		 String alter="alter table student  change " + oldColName + " "+newColName +" "+datatype;
		 int x=st.executeUpdate(alter);
		 if(x==0)
			 System.out.println("altered");
	 }else if(choice==2) {
		 System.out.println("enter the new colname");
		 String newColName=sc.next();
		 System.out.println("enter the datatype of new colname");
		 String datatype=sc.next();
		 String alter="alter table student add "+ newColName +" "+ datatype;
		 int x=st.executeUpdate(alter);
		 if(x==0)
			 System.out.println("altered");
	 }else if(choice==3)
	 {
		 System.out.println("enter the column name:");
		 String newColName=sc.next();
		 String alter ="alter table student drop column "+ newColName ;
		 int x=st.executeUpdate(alter);
		 if(x==0)
			 
			 System.out.println("altered");
	
	 }
	
	
	}

}
