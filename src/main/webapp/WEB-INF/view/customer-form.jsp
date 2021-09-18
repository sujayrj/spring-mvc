<%--
  Created by IntelliJ IDEA.
  User: sujay
  Date: 18-09-2021
  Time: 06:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
</head>
<body>
    <h2>Add a new Customer</h2>
    <form method="post" action="save">
        <p>First Name : <input type="text" name="first"/> </p>
        <p>Last Name : <input type="text" name="last"/> </p>
        <p>Phone Number : <input type="text" name="phone"></p>
        <input type="submit" value="Add Customer"/>
    </form>
</body>
</html>
