<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/9/2021
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Customer</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        button {
            width: 100px;
        }
    </style>
</head>
<body>
<div class="container">
    <h3>Danh sách khách hàng</h3>
    <a href="?action=add">Tạo mới khách hàng</a>
    <table class="table">
        <tr>
            <th>Mã KH</th>
            <th>Tên KH</th>
            <th>Email</th>
            <th>Địa chỉ</th>
        </tr>

        <c:forEach items="${customerList}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="?action=edit&id=${customer.id}">
                    <button class="btn btn-warning">EDIT</button>
                </a></td>
                <td><a href="?action=delete&id=${customer.id}">
                    <button class="btn btn-danger">DELTE</button>
                </a></td>
            </tr>
        </c:forEach>

    </table>
</div>
</body>
</html>
