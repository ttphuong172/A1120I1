<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/7/2021
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
    <form action="/emaillist" method="post">
        <h3>Join our email list</h3>
        <p>To join our email list, enter your name and email address blow</p>
        <p>${message}</p>
        <label for="">Email</label>
        <input type="text" name="email">
        <br>
        <label for="">First Name</label>
        <input type="text" name="firstname">
        <br>
        <label for="">Last Name</label>
        <input type="text" name="lastname"><br>

        <input type="submit" value="Join Now" class="btn btn-primary">
    </form>
</div>
</body>
</html>
