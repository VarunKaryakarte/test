<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action = "/signup" method = "post">
<pre>
  First Name: <input type = "text" name = "firstName">
  Last Name: <input type = "text" name = "lastName" >
  Email:<input type = "text" name = "email">
  Password:<input type = "password" name = "password">
<input type = "submit" value = "register">
</pre>
</form>
</body>
</html>