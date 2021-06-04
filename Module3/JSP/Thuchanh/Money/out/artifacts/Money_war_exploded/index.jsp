<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/4/2021
  Time: 8:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

  </head>
  <body>
  <form class="form-group" action="/convert" method="post">
  <label for="">Rate</label>
  <input type="text" name="rate">
  <label for="">USD</label>
  <input type="text" name="usd">
    <input class="btn btn-primary" type="submit" value="Converter" >
  </form>
  </body>
</html>
