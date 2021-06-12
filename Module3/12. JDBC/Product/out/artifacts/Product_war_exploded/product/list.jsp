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
    <div>
        <p>Tìm kiếm sản phẩm</p>
    <form action="/?action=find" method="post">
        <input type="text" name="find">
        <input type="submit" value="TÌM KIẾM" >
    </form>
    </div>
    <c:if test="${empty product}">
    <table class="table">
        <tr>
            <th>Mã SP</th>
            <th>Tên SP</th>
            <th>Giá SP</th>
            <th>Sửa</th>
            <th>Xóa</th>
        </tr>

        <c:forEach items="${productList}" var="productlist">
            <tr>
                <td>${productlist.id}</td>
                <td>${productlist.name}</td>
                <td>${productlist.price}</td>
                <td><a href="/?action=update&id=${productlist.id}"><button class="btn btn-warning">EDIT</button></a></td>
                <td><a href="/?action=delete&id=${productlist.id}"><button onclick="return confirm('Are you sure ?')" class="btn btn-danger">XÓA</button></a></td>
            </tr>
        </c:forEach>
    </table>
    </c:if>

    <c:if test="${not empty product}">
        <table class="table">
            <tr>
                <th>Mã SP</th>
                <th>Tên SP</th>
                <th>Giá SP</th>
                <th>Sửa</th>
                <th>Xóa</th>
            </tr>


                <tr>
                    <td>${product.id}</td>
                    <td>${product.name}</td>
                    <td>${product.price}</td>
                    <td><a id="delete" href="/?action=update&id=${product.id}"><button class="btn btn-warning">EDIT</button></a></td>
                    <td><a href="/?action=delete&id=${product.id}"><button class="btn btn-danger">XÓA</button></a></td>
                </tr>

        </table>
    </c:if>
</div>

</body>
</html>
