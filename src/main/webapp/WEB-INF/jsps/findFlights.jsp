 <%--
  Created by IntelliJ IDEA.
  User: binod
  Date: 4/19/19
  Time: 5:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Flights</title>
</head>
<body>
    <form action="findflight" method="post">
        From: <input type="text" name="from"/>
        To : <input type="text" name="to"/>
        Departure Date: <input type="text" name="departureDate"/>
        <input type="submit" value="search"/>
    </form>

</body>
</html>
