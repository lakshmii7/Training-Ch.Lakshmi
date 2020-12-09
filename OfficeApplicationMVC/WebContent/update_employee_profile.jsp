<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>        
<center><h1>WELCOME TO MANAGER HOME</h1></center>
<br><br><br>
<a href="employee_home.html">Home</a> |
<a href="employee_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.company.EmployeeRegisterBean" %>

<%
EmployeeRegisterBean eb=(EmployeeRegisterBean)session.getAttribute("employeeDetails");
if(eb!=null) {
%>
<form action="./employee_update" method="post" align="center">
<input type="hidden" name="id" value="<%=eb.getId()%>">
<input type="text" name="Ename" value="<%=eb.getEname() %>">
<input type="email" name="email" value="<%=eb.getEmail() %>">
<input type="number" name="phone" value="<%=eb.getPhone() %>">
<input type="number" name="salary" value="<%=eb.getSalary()%>">
<input type="text" name="gender" value="<%=eb.getGender() %>">
<select name="designation">
<option value="<%=eb.getDesignation()%>"><%=eb.getDesignation()%></option>
<option value="Developer">Developer</option>
<option value="QA">QA</option>
<option value="HR">HR</option>
</select>
<input type="submit" value="update">
</form>
<%}%>