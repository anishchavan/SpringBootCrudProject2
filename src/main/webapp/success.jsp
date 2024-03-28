<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>Eid</th>		
			<th>Ename</th>		
			<th>Ecity</th>		
			<th>Username</th>		
			<th>Password</th>
			<th>Action</th>			
		</tr>
		<c:forEach items="${data}" var="e">
			<tr>
				<td>${e.eid}</td>
				<td>${e.ename}</td>
				<td>${e.ecity}</td>
				<td>${e.username}</td>
				<td>${e.password}</td>
				<td><a href="edit?eid=${e.eid}">edit</a>||<a href="delete?eid=${e.eid}" style="color:red">delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<a href="/"><< -- Back to Login</a>
</body>
</html>