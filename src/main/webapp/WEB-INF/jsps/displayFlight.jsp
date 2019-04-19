<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binod
  Date: 4/19/19
  Time: 5:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Flight</title>
</head>
<body>

<h2>Flights</h2>

<table>
    <tr>
        <td>Airlines</td>
        <td>Departure City</td>
        <th>Departure Time</th>

    </tr>


    <c:forEach items="${flights}" var="f">

        <tr>
            <td></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
