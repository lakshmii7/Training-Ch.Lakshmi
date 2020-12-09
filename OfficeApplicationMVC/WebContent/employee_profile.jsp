<!DOCTYPE html>
<html>

<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO EMPLOYEE HOMEPAGE</h1></center>
<br><br><br>
<a href="employee_home.html">Home</a> |
<a href="employee_profile.jsp">Profile</a> |
|<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.company.EmployeeRegisterBean" %> 

<table border="2" align="center" width="600" height="300" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>gender</td><td>salary</td><td>designation</td><td>no of leaves taken<td>Action</td></tr>
<%
EmployeeRegisterBean eb=(EmployeeRegisterBean)session.getAttribute("ebean");
if(eb!=null) {
%>
<tr>

<td><%=eb.getId() %></td>
<td><%=eb.getEname() %></td>
<td><%=eb.getEmail() %></td>
<td><%=eb.getPhone() %></td>
<td><%=eb.getGender() %></td>
<td><%=eb.getSalary() %></td>
<td><%=eb.getDesignation() %></td>
<td><%=eb.getNo_of_leaves_taken()%></td>

<td><a href="update_employee_profile.jsp?id=<%=eb.getId()%>">Update</a></td>
</tr>

<%}  %>
</table>
</body>
</html>