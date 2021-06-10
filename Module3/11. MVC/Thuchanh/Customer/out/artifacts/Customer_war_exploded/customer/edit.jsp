<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/9/2021
  Time: 11:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Edit Customer</title>
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
    <h3>Chỉnh sửa khách hàng</h3>
    <form action="/edit" method="post" class="from-group">
        <label for=""> Mã KH</label>
        <input type="text" name="id"  readonly="readonly" value="${customer.id}">
        <br>
        <label for=""> Tên KH</label>
        <input type="text" name="name" value="${customer.name}">
        <br>
        <label for=""> Email</label>
        <input type="text" name="email" value="${customer.email}">
        <br>
        <label for=""> Địa chỉ</label>
        <input type="text" name="address" value="${customer.address}">
        <br>
        <label for=""></label>
        <input type="submit" value="Cập nhật" class="btn btn-primary">
    </form>
</div>
</body>
</html>
