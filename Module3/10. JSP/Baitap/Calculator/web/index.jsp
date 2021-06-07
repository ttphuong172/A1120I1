<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/5/2021
  Time: 3:58 PM
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
    <style>
      label{
        display: inline-block;
        width: 200px;
      }
    </style>
  </head>
  <body>
<div class="container">
  <h3>Simple Calculator</h3>
  <p>${myError}</p>
  <form action="/calculate" method="post">
    <label for="">First Operand</label>
    <input type="text" name="first">
    <br>
    <br>
    <label for="">Operator</label>
    <select name="operator">
      <option value="+">Addition</option>
      <option value="-">Subtraction</option>
      <option value="*">Multiplication</option>
      <option value="/">Division</option>
    </select>
    <br>
    <br>
    <label for="">Second Operand</label>
    <input type="text" name="second">
    <br>
    <br>
    <label for=""></label>
    <input type="submit" value="Calculate" >
  </form>
</div>
  </body>
</html>
