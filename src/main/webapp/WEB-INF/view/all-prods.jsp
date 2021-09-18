<%--
  Created by IntelliJ IDEA.
  User: sujay
  Date: 16-09-2021
  Time: 10:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>All Products Page</title>
</head>
<body>
<h1>All Products page!</h1>

<table border="1px;">
    <tr>
        <th>Product name</th>
        <th>Product price</th>
    </tr>
    <c:forEach items="${prods}" var="prod">
        <tr>
            <td><c:out value="${prod.name}"/></td>
            <td><c:out value="${prod.price}"/></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
