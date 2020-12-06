<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<br><br><br>
<center><h1>Welcome to Motivity Leave Page</h1></center>
<br><br><br>
<a href="manager_home.html">Home</a>|
<a href="manager_Login.html">Profile</a>|
<a href="view_leave.jsp">View Leaves</a>|
<a href="index.html">Logout</a>
<br><br><br>
<%@include file="connect.jsp" %>
<table border="2px;" align="center" width="500" hight="300">
		<tr>
			<td>Employee Name</td>
			<td>Email</td>
			<td>Phone</td>
			<td>Gender</td>
			<td>No of days</td>
			<td>Date of leave</td>
			<td>Designation</td>
			<td>Manager Name</td>
			<td>Status</td>
			<td>Action</td>
		</tr>
<%
ps=con.prepareStatement("select * from leaves ");
ResultSet rs=ps.executeQuery();
while(rs.next()){
%>
<tr>
			<td><%=rs.getString(2) %></td>
			<td><%=rs.getString(3) %></td>
			<td><%=rs.getInt(4) %></td>
			<td><%=rs.getString(5) %></td>
			<td><%=rs.getInt(6) %></td>
			<td><%=rs.getString(7) %></td>
			<td><%=rs.getString(8) %></td>
			<td><%=rs.getString(9) %></td>
			<td><%=rs.getString(10) %></td>
			
			<td>Accepted</td>
			
			
		</tr>
		<%} %>
		
</table>
<br><br>
</body>
</html>