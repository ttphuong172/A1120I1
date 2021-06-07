<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/7/2021
  Time: 9:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <h3>Thanks for joining our email list</h3>
    <p>Here is the information thay you entered</p>
<table  class="table">
    <tr>
        <th>Email</th>
        <th>FirstName</th>
        <th>LastName</th>
    </tr>
    <c:forEach items="${userList}" var="user" >
    <tr>
        <td>${user.email}</td>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
    </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
