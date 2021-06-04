<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/4/2021
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>

<table class="table table-bordered">
    <tr>
        <td>Rate</td>
        <td>
            <c:out value="${rate}"></c:out>
        </td>
    </tr>
    <tr>
        <td>USD</td>
        <td>
            <c:out value="${usd}"></c:out>
        </td>
    </tr>
    <tr>
        <td>VND</td>
        <td>
            <c:out value="${vnd}"></c:out>
        </td>
    </tr>
</table>
</body>
</html>
