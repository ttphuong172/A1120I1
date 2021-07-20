<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/7/2021
  Time: 6:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sach san pham</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<table class="table table-bordered">
    <tr>
        <td>
            <a href="/sanpham/create">
                <button class="btn btn-info">+ Add new product</button>
            </a>
        </td>
        <form action="">
            <input type="hidden" name="action" value="search">
        <td>
            <input type="text" class="form-control" placeholder="Search" name="tensanpham">

        </td>
            <td>
                <button type="submit" class="btn btn-info">Search</button>
            </td>
        </form>
    </tr>
</table>

    <table class="table table-bordered">
        <thead>
        <tr>
            <th>#</th>
            <th>Product Name</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Color</th>
            <th>Category</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${empty sanPhamSearch}">
        <c:forEach items="${listSanPham}" var="listsanpham">
            <tr>
                <td>${listsanpham.id}</td>
                <td>${listsanpham.tenSanPham}</td>
                <td>${listsanpham.giaSanPham}</td>
                <td>${listsanpham.soLuong}</td>
                <td>${listsanpham.mauSac}</td>
                <td>${listsanpham.danhMuc.tenDanhMuc}</td>
                <td>
                    <a href="/sanpham?action=edit&id=${listsanpham.id}">
                    <button class="btn btn-info">Edit</button></a>
                </td>
            </tr>
        </c:forEach>
        </c:if>

        <c:if test="${not empty sanPhamSearch}">
            <c:forEach items="${sanPhamSearch}" var="sanphamsearch">
                <tr>
                    <td>${sanphamsearch.id}</td>
                    <td>${sanphamsearch.tenSanPham}</td>
                    <td>${sanphamsearch.giaSanPham}</td>
                    <td>${sanphamsearch.soLuong}</td>
                    <td>${sanphamsearch.mauSac}</td>
                    <td>${sanphamsearch.danhMuc.tenDanhMuc}</td>
                    <td>
                        <a href="/sanpham?action=edit&id=${sanphamsearch.id}">
                            <button class="btn btn-info">Edit</button></a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</div>
</body>
</html>
