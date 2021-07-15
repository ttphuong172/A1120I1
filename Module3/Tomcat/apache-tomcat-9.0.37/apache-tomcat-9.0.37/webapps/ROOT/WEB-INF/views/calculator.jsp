<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 15/07/2021
  Time: 9:10 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h3>Calculator</h3>
<form action="/pheptinh">
    <input type="text" name="num1" value="${num1}">
    <input type="text" name="num2" value="${num2}">
    <br>
    <br>
    <input type="submit" value="addition" name="pheptinh">
    <input type="submit" value="subtraction" name="pheptinh">
    <input type="submit" value="multiplication" name="pheptinh">
    <input type="submit" value="division" name="pheptinh">
</form>
<h3> ${name} ${sum}</h3>
</body>
</html>
