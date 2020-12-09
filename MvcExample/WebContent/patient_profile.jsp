<!DOCTYPE html>
<html>
<body bgcolor="powderblue">
<br><br><br>
<center><h1>WELCOME TO PATIENT HOME</h1></center>
<br><br><br>
<a href="patient_home.html">Home</a> |
<a href="patient_profile.jsp">Profile</a> |
<a href="index.html">Logout</a>
<br><br><br>
<%@page import="com.mvc.PatientRegisterBean" %>
<table  border="2" align="center" width="500" height="300">
tr><td>Id</td><td>Name</td><td>Age</td><td>Gender</td><td>Address<td>Email</td><td>Password</td><td>Phonenumber</td><td>Action</td></tr>
<%
PatientRegisterBean bp=(PatientRegisterBean)session.getAttribute("patientdetails");
if(bp!=null) {
	%>
	<tr>
	
	<td><%=bp.getName()%></td>
	<td><%=bp.getAge()%></td>
	<td><%=bp.getGender() %></td>
	<td><%=bp.getAddress() %></td>
	<td><%=bp.getEmail() %></td>
	<td><%=bp.getPassword() %></td>
	<td><%=bp.getPhonenumber() %></td>
</tr>
  <%
  }
       %>


</table>    
</body>
</html>