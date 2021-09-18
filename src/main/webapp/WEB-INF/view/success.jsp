<%--
  Created by IntelliJ IDEA.
  User: sujay
  Date: 18-09-2021
  Time: 11:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Signup Success</title>
</head>
<body>
    <h1>Signup Success</h1>
    <h3>User Signup details </h3>
    <p>Name : ${user.name}</p>
    <p>Email : ${user.email}</p>
    <h5>Address</h5>
    <p>Street name : ${user.address.street}</p>
    <p>Street city : ${user.address.city}</p>
</body>
</html>
