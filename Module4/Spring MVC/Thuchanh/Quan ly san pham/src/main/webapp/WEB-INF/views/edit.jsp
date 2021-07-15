<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/7/2021
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Chinh sua san pham</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap4.css">
</head>
<body>

<div class="container">
    <h3>Edit product</h3>
    <form action="/sanpham?action=update" method="post">
        <div class="form-group" >
            <label for="">Id</label>
            <input type="text" class="form-control" name="id" value="${sanPham.id}" readonly="readonly">
            <label for="">Name</label>
            <input type="text" class="form-control" name="tensanpham" value="${sanPham.tenSanPham}">
            <label for="">Price</label>
            <input type="text" class="form-control" name="giasanpham" value="${sanPham.giaSanPham}">
            <label for="">Quantity</label>
            <input type="text" class="form-control" name="soluong" value="${sanPham.soLuong}">
            <label for="">Color</label>
            <input type="text" class="form-control" name="mausac" value="${sanPham.mauSac}">
            <label for="">Description</label>
            <input type="text" class="form-control" name="mota" value="${sanPham.moTa}">
            <label for="">Category</label>
            <select name="iddanhmuc" id="" class="custom-select">
                <c:forEach items="${listDanhMuc}" var="listdanhmuc">
                    <option value="${listdanhmuc.idDanhMuc}">${listdanhmuc.tenDanhMuc} </option>
                </c:forEach>
            </select>
            <label for=""></label>
            <button type="submit" class="btn btn-success">Update</button>
        </div>
    </form>
</div>

</body>
</html>
