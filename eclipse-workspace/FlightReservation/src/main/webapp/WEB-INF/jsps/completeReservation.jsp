<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<h2> COMPLETE RESERVATION</h2>
Airline : ${flight.operatingAirlines } <br/>
Departure City : ${flight.departureCity }<br/>
Arrival City : ${flight.arrivalCity } <br/>

<form action = "completeReservation" method = "POST">
<pre>
<h2> Card details :</h2>
Name on the card: <input type = "text" name = "nameOnTheCard"/>
Card number: <input type = "text" name = "cardNumber"/>
Expiry Date: <input type = "text" name = "expiryDate"/>
Three Digit Sec code: <input type = "text" name = "securityCode"/>


<h2> Passenger Details </h2>
First Name: <input type = "text" name = "passengerFirstName"/>
Last Name: <input type = "text" name = "passengerLastName"/>
Email: <input type = "text" name = "passengerEmail"/>
Phone: <input type = "text" name = "passengerPhone"/>
<input type = "hidden" name = "flightId" value = "${flight.id }"/>
<input type = "submit" value = "confirm"/>
</pre>



</form>
</body>
</html>