<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/10/2021
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>


<div class="container">
    <h3>DANH SÁCH SẢN PHẨM</h3>
    <a href="/?action=create">
        <button class="btn btn-primary">THÊM MỚI</button>
    </a>


    <table class="table">
        <tr>
            <th>Mã SP</th>
            <th>Tên SP</th>
            <th>Giá SP</th>
        </tr>

        <c:forEach items="${productList}" var="productlist">
            <tr>
                <td>${productlist.id}</td>
                <td>${productlist.name}</td>
                <td>${productlist.price}</td>
                <td><a href="/?action=update&id=${productlist.id}"><button class="btn btn-warning">EDIT</button></a></td>
                <td><a href="/?action=delete&id=${productlist.id}"><button class="btn btn-danger">XÓA</button></a></td>
            </tr>
        </c:forEach>
    </table>



</div>
</body>
</html>
