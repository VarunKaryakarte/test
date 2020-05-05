<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
<form action = "login" method = "post">
<pre>
	First Name : <input type = "text" name = "firstName"/>
	Last Name : <input type = "text" name = "lastName"/>
	Username : <input type = "text" name = "email"/>
	Password : <input type = "password" name = "password"/>
	Confirm Password : <input type = "password" name = password/>
	<input type = "submit" value = "register" />
	<a href = "showLogin">Click here if you are an existing user</a>
</pre>
</form>


</body>
</html>
