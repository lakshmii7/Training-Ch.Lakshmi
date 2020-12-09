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
<%@ page import="com.company.ManagerRegisterBean" %>
<% 
ManagerRegisterBean mb=(ManagerRegisterBean)session.getAttribute("managerDetails");
if(mb!=null) {

%>
<form action="./manager_update" method="post" align="center">
<input type="hidden" name="id" value="<%=mb.getId()%>">
<input type="text" name="name" value="<%=mb.getName() %>">
<input type="email" name="email" value="<%=mb.getEmail() %>">
<input type="number" name="phone" value="<%=mb.getPhone() %>">
<input type="number" name="salary" value="<%=mb.getSalary()%>">
<input type="text" name="gender" value="<%=mb.getGender() %>">
<input type="number" name="experience" value="<%=mb.getExperience()%>">
<select name="designation">
<option value="<%=mb.getDesignation()%>"><%=mb.getDesignation()%></option>
<option value="Team Manager">Team Manager</option>
<option value="Project Manager">Project Manager</option>

</select>
<input type="submit" value="update">
</form>
<%}%>