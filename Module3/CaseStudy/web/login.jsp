<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/28/2021
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        label{
            display: inline-block;
            width: 150px;
        }
    </style>
</head>
<body>
<div class="container-fluid">

    <div class="row">
        <div class="col-sm-4"></div>
        <div class="col-sm-4">
            <form action="?action=login" method="post">
                <h3>QUẢN LÝ KHÁCH SẠN</h3>
                <label for="">Username:</label>
                <input type="text" name="username">
                <br>
                <label for="">Password</label>
                <input type="password" name="password">
                <br>
                <label for=""></label>
                <input type="checkbox" name="rememberMe" value="true">Remember Me
                <br>
                <label for=""></label>
                <input class="btn btn-primary" type="submit" value="Đăng nhập">
            </form>
        </div>
        <div class="col-sm-4"></div>
    </div>
</div>

</body>
</html>
