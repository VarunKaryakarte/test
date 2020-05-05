<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> User Login</title>
</head>
<body>
<form action = "login" method = "post">
<pre>
UserName : <input type = "text" name = "email"/>
Password : <input type = "password" name = "password"/>
${msg}
<input type = "submit" value = login> 
</pre>
</form>


</body>
</html>