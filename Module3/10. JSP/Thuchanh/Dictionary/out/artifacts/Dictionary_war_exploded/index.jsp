<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/4/2021
  Time: 8:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Dictionary</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  </head>
  <body>
  <div class="container">
  <h1>Vietnamese Dictionary</h1>
  <form class="form-group" action="/dictionary" method="post">
    <input type="text" name="search" >
    <input class="btn btn-primary" type="submit" value="Search">
  </form>
  </div>
  </body>
</html>
