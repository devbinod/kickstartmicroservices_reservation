<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 4/20/19
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Complete Reservation</title>
</head>
<body>
<h2>

    Complete Reservation
</h2>

Airline : ${flight.operatingAirlines}<br/>
Departure City: ${flight.departureCity}<br/>
Arrival City: ${flight.arrivalCity}


<form action="completeReservation" method="post">

    <h2>Passenger Detail</h2>
    First name: <input type="text" name="passengerFirstname"/>


</form>
</body>
</html>
