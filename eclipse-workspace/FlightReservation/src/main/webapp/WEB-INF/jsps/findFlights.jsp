<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book your Flight</title>
</head>
<body>
<form action = "findFlights" method = "POST">
FROM: <input type = "text" name = "from"/>
TO: <input type = "text" name = "to"/>
Departure Date: <input type = "text" name = "departureDate"/>
<input type = "submit" value = "search" />
</form>
</body>
</html>