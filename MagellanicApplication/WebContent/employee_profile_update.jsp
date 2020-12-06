<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%

int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
int phone=Integer.parseInt(request.getParameter("phone"));
int salary=Integer.parseInt(request.getParameter("salary"));
String gender=request.getParameter("gender");
String designation=request.getParameter("designation");
int no_of_leaves_taken=Integer.parseInt(request.getParameter("no_of_leaves_taken"));


ps=con.prepareStatement("update employee set name=?,email=?,phone=?,salary=?,designation=?,gender=?,no_of_leaves_taken where id=?");
ps.setString(1, name);
ps.setString(2, email);
ps.setInt(3,phone);
ps.setInt(4,salary);
ps.setString(5,designation);
ps.setString(6,gender);
ps.setInt(7,no_of_leaves_taken);
ps.setInt(8,id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("employee_profile.jsp?msg=Updated");
%>