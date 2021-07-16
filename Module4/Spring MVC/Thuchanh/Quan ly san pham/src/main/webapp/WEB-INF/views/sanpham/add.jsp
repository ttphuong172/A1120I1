<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/7/2021
  Time: 6:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Them moi san pham</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap4.css">
</head>
<body>

<div class="container">
    <h3>Add new product</h3>
    <form:form action="/sanpham/save" method="post" modelAttribute="sanPham">

    <div class="form-group" >

        <label for="">Name</label>
        <form:input type="text" class="form-control" path="tenSanPham"/>
        <label for="">Price</label>
        <form:input type="text" class="form-control" path="giaSanPham"/>
        <label for="">Quantity</label>
        <form:input type="text" class="form-control" path="soLuong"/>
        <label for="">Color</label>
        <form:input type="text" class="form-control" path="mauSac"/>
        <label for="">Description</label>
        <form:input type="text" class="form-control" path="moTa"/>

        <label for="">Category</label>

        <form:select path="danhMuc" id="" class="custom-select" >


            <form:options items="${listDanhMuc}" itemValue="abc" itemLabel="xyz"/>

        </form:select>


        <label for=""></label>
        <button type="submit" class="btn btn-success">Create</button>
    </div>
    </form:form>
</div>
</body>
</html>
