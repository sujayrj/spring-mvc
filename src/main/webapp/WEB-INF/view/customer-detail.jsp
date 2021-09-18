<%--
  Created by IntelliJ IDEA.
  User: sujay
  Date: 18-09-2021
  Time: 06:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Customer Details</title>
</head>
<body>
    <h1>Customer Details</h1>
    <p>First Name : ${customer.firstName}</p>
    <p>Last Name : ${customer.lastName}</p>
    <h3>Phone Number :</h3>
    <p>Area code : ${customer.phone.areaCode}</p>
    <p>Prefix : ${customer.phone.prefix}</p>
    <p>Number: ${customer.phone.number}</p>
</body>
</html>
