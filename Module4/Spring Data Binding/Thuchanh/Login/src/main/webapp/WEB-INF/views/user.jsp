<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 20/07/2021
  Time: 8:45 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Thông tin User</title>
</head>
<body>
    <h3>Thông tin User</h3>
    <table>
        <tr>
            <td>Account</td>
            <td>${user.account}</td>
        </tr>
        <tr>
            <td>Password</td>
            <td>${user.password}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${user.age}</td>
        </tr>
    </table>
</body>
</html>
