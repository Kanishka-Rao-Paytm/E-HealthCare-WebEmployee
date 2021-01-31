<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h3>User Registration</h3>
<form action="<%= request.getContextPath() %>/employeeregister" method="post">
<table style ="width:80%">
<tr>
<td>Id</td>
<td><input type = "text" name = "id" /> </td>
</tr>

<tr>
<td>Full Name</td>
<td><input type = "text" name = "fullname" /> </td>
</tr>

<tr>
<td>Phone</td>
<td><input type = "text" name = "phone" /> </td>
</tr>

<tr>
<td>Email</td>
<td><input type = "text" name = "email" /> </td>
</tr>

<tr>
<td>Job Role</td>
<td><input type = "text" name = "jobrole" /> </td>
</tr>

<tr>
<td>Department</td>
<td><input type = "text" name = "dept" /> </td>
</tr>
</table>
<input type="submit" value="Submit" />
</form></div>
</body>
</html>