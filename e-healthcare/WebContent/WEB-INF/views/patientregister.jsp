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
<h2>
Patient Registration</h2>
<form action="<%= request.getContextPath() %>/patientregister" method="post">
<table style ="width:80%">
<tr>
<td>Id</td>
<td><input type = "number" name = "id" /> </td>
</tr>

<tr>
<td>Full Name</td>
<td><input type = "text" name = "fullname" /> </td>
</tr>

<tr>
<td>Phone</td>
<td><input type = "number" name = "phone" /> </td>
</tr>

<tr>
<td>Email</td>
<td><input type = "text" name = "email" /> </td>
</tr>

</table>
<input type="submit" value="Submit" />
</form></div>
</body>
</html>