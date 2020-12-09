<!DOCTYPE html>
<html>

<body bgcolor="wheat">
<br><br><br>
<center><h1>WELCOME TO MANAGER HOMEPAGE</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a> |
<a href="manager_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@ page import="com.company.ManagerRegisterBean" %> 

<table border="2" align="center" width="600" height="300" cellpadding="20">
<tr><td>Id</td><td>Name</td><td>Email</td><td>Phone</td><td>gender</td><td>salary</td><td>experience</td><td>designation<td>Action</td></tr>
<%
int id=(Integer)session.getAttribute("id");
ManagerRegisterBean mb=(ManagerRegisterBean)session.getAttribute("mbean");
if(mb!=null) {

%>
<tr>

<td><%=mb.getId() %></td>
<td><%=mb.getName() %></td>
<td><%=mb.getEmail() %></td>
<td><%=mb.getPhone() %></td>
<td><%=mb.getGender() %></td>
<td><%=mb.getSalary() %></td>
<td><%=mb.getExperience()%></td>
<td><%=mb.getDesignation() %></td>
<td><a href="update_manager_profile.jsp?id=<%=mb.getId()%>">Update</a></td>
</tr>

<%}  %>
</table>
</body>
</html>