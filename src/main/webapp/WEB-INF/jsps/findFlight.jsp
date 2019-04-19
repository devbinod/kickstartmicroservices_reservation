<%--
  Created by IntelliJ IDEA.
  User: binod
  Date: 4/19/19
  Time: 5:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Find Flight</title>
</head>
<body>

    <form action="findFlight" method="post">

      <pr>
          From: <input type="text" name="from"/>
          To : <input type="text" name="to"/>
          Depature Date: <input type="text" name="departureData"/>
          <input type="submit" value="Search"/>
      </pr>

    </form>

</body>
</html>
