<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 15/07/2021
  Time: 7:46 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<h3>Sandwich Condiments</h3>
<form action="/save" method="post">
    <input type="checkbox" value="Lettuce" id="lettuce" name="condiment">
    <label for="lettuce">Lettuce</label>

    <input type="checkbox" value="Tomato" id="tomato" name="condiment">
    <label for="tomato">Tomato</label>

    <input type="checkbox" value="Mustard" id="mustard" name="condiment">
    <label for="mustard">Mustard</label>

    <input type="checkbox" value="Sprouts" id="sprouts" name="condiment">
    <label for="sprouts">Sprouts</label>
    <br>
    <br>
    <input type="submit" value="Save">
</form>
</body>
</html>
