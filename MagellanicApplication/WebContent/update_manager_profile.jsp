<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>        
<center><h1>WELCOME TO MANAGER HOME</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a> |
<a href="manager_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="java.sql.*" %>
<%@include file="connect.jsp" %>
<%
int id=Integer.parseInt(request.getParameter("id"));
ps=con.prepareStatement("select * from manager where id=?");
ps.setInt(1,id);
ResultSet rs=ps.executeQuery();
if(rs.next()) {
%>
<form action="./manager_profile_update.jsp" align="center">
<input type="hidden" name="id" value="<%=rs.getInt("id")%>">
<input type="text" name="name" value="<%=rs.getString("name") %>">
<input type="email" name="email" value="<%=rs.getString("email") %>">
<input type="number" name="phone" value="<%=rs.getInt("phone") %>">
<input type="number" name="salary" value="<%=rs.getInt("salary")%>">
<input type="text" name="gender" value="<%=rs.getString("gender") %>">
<input type="number" name="experience" value="<%=rs.getInt("experience")%>">
<select name="designation">
<option value="<%=rs.getString("designation")%>"><%=rs.getString("designation")%></option>
<option value="Team Manager">Team Manager</option>
<option value="Project Manager">Project Manager</option>

</select>
<input type="submit" value="update">
</form>
<%}%>