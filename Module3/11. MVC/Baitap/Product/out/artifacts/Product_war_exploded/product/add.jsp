<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/10/2021
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add Product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        label{
            display: inline-block;
            width: 100px;
        }
    </style>

</head>
<body>
<div class="container">
    <h3>THÊM MỚI SẢN PHẨM</h3>
<form method="post" class="form-group">
    <label for="">id</label>
    <input type="text" name="id">
    <br>
    <label for="">name</label>
    <input type="text" name="name">
    <br>
    <label for="">price</label>
    <input type="text" name="price">
    <br>
    <label for=""></label>
    <input type="submit" value="Thêm mới" class="btn btn-primary">
</form>
</div>
</body>
</html>
