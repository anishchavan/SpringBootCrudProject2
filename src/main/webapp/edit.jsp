<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
	<form action="update">
		<pre>
			<input type="hidden" name="eid" value="${data.eid}"/>
			Employee name: <input type="text" name="ename" value="${data.ename}"/><br>
			Employee city: <input type="text" name="ecity" value="${data.ecity}"/><br>
			Employee username: <input type="text" name="username" value="${data.username}"/><br>
			Employee password: <input type="text" name="password" value="${data.password}"/><br>
			<input type="submit" value="UPDATE"/><br> 
		</pre>
	</form>
</body>
</html>