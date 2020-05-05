<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="Content-Type" content = "text/html; charset =UTF-8">
<title>Flights</title>
</head>
<body>
<h2> Flights </h2>
<table>
<tr><th> Airlines </th>
<th> Departure City </th>
<th> Arrival City </th>
<th> Departure time </th>
<th> Flight Id </th>
</tr>
<c:forEach items = "${flights}"  var = "flight" >
<tr>
<td> ${flight.operatingAirlines }</td>
<td> ${flight.departureCity }</td>
<td> ${flight.arrivalCity }</td>
<td> ${flight.arrivalTime }</td>
<td> flight ID:${flight.id }</td>
<td>
<form action = "showCompleteReservation" method = "POST" >
 <input type = "hidden" name = "flightId" value = "${flight.id}" >
 <input type = "submit" value = "select" />
</form>
</td>
</tr>
</c:forEach>
</table>
</body>
</html>