<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/2/2021
  Time: 8:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <style>
        label{
            display: inline-block;
            width: 120px;
        }
    </style>
</head>
<body>
<h3>Đăng nhập</h3>
<form action="/login" method="post">
    <label for="">Tên đăng nhập</label>
    <input type="text" name="username">
    <br>
    <br>
    <label for="">Mật khẩu</label>
    <input type="text" name="password">
    <br>
    <br>
    <label for=""></label>
    <input type="submit" value="Đăng nhập">
</form>
</body>
</html>
