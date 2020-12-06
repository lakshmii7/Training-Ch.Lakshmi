<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%

int id=Integer.parseInt(request.getParameter("id"));
String name=request.getParameter("name");
String email=request.getParameter("email");
int phone=Integer.parseInt(request.getParameter("phone"));
int experience=Integer.parseInt(request.getParameter("experience"));
int salary=Integer.parseInt(request.getParameter("salary"));
String gender=request.getParameter("gender");
String designation=request.getParameter("designation");


ps=con.prepareStatement("update manager set name=?,email=?,phone=?,experience=?,salary=?,gender=?,designation=? where id=?");
ps.setString(1, name);
ps.setString(2, email);
ps.setInt(3,phone);
ps.setInt(4,experience);
ps.setInt(5,salary);
ps.setString(6,gender);
ps.setString(7,designation);
ps.setInt(8, id);
int x=ps.executeUpdate();
if(x!=0)
	response.sendRedirect("manager_profile.jsp?msg=Updated");
%>