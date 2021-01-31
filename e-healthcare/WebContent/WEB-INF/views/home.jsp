<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2 align="center">Welcome Home!</h2>
<body>
<form action="<%= request.getContextPath() %>/home" method="get">
<br>
<br>
<a href = "employeeregister.jsp">Register User</a>
</form>
</body>
</html>