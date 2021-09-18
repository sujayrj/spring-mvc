<%--
  Created by IntelliJ IDEA.
  User: sujay
  Date: 18-09-2021
  Time: 10:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Edit Form</title>
</head>
<body>
<h1>Customer Edit Form</h1>
<form method="post" action="save">
    <p>First Name : <input type="text" name="first" value="${customer.firstName}"/></p>
    <p>Last Name : <input type="text" name="last" value="${customer.lastName}"/></p>
    <p>Phone Number : <input type="text" name="phone" value="${customer.phone}"></p>
    <input type="submit" value="Add Customer"/>
</form>
</body>
</html>
