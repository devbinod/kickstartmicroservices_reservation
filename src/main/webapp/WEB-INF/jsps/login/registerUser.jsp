<%--
  Created by IntelliJ IDEA.
  User: binod
  Date: 4/19/19
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>

    <form action="registerUser" method="post">
        <pre>

        First name: <input type="text" name="firstname"/>
        Last name: <input type="text" name="lastname"/>
        User: <input type="text" name="email"/>
        Password: <input type="text" name="password"/>
        Confirm Password: <input type="text" name="confirmPassword"/>
        <input type="submit" value="Register"/>
        </pre>


    </form>

</body>
</html>
