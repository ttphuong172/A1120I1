<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/1/2021
  Time: 9:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body>
<div class="container">
<form method="post" action="/welcome">
<div class="form-group">
    <h2>Login</h2>
    <input type="text" name="username"  class="form-control"  placeholder="username" />
    <input type="password" name="password" class="form-control" placeholder="password" />
    <input type="submit" value="Sign in"/>
</div>
</form>
</div>
</body>
</html>
