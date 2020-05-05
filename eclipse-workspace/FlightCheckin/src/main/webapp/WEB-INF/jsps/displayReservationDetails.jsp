<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details </title>

</head>
<body>
<h2>Flight Details</h2>
AirLines: ${reservation.flightId.operatingAirlines} <br>
Flight Number : ${reservation.flightId.flightNumber}<br>
Daparture City: ${reservation.flightId.departureCity}<br>
Arrival city: ${reservation.flightId.arrivalCity}<br>
dateOfDeparture: ${reservation.flightId.dateOfDeparture}<br>

<h2> Passenger Details </h2>
First Name : ${reservation.passengerId.firstName}<br>
last Name : ${reservation.passengerId.lastName}<br>
email : ${reservation.passengerId.email}<br>
Phone : ${reservation.passengerId.phoneNumber}<br>
<form action = "completeCheckIn" method = "post">
Enter number of bags : <input type = "text" name = "numberOfBags"/>
<input type = "hidden" name = "reservationId" value = "${reservation.id }"/>
<input type = "submit" value = "Check In" />
</form>
</body>
</html>