<%--
  Created by IntelliJ IDEA.
  User: sujay
  Date: 18-09-2021
  Time: 11:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup Page</title>
</head>
<body>
    <h1>Signup Form</h1>
    <form method="post" action="processSignup">
        <p>Name : <input type="text" name="name"/> </p>
        <p>Email : <input type="text" name="email"/> </p>
        <h3>Address:</h3>
        <p>Street : <input type="text" name="address.street"></p>
        <p>City : <input type="text" name="address.city"></p>
        <input type="submit" value="Signup">
    </form>
</body>
</html>
