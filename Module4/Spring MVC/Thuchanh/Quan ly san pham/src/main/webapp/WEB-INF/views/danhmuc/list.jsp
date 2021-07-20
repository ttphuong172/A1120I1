<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 16/07/2021
  Time: 2:56 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh muc</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
<h3>Danh sách danh mục</h3>
<a href="/danhmuc/create"><input type="submit" value="Add Danh Muc"></a>
<p style="color: green">${msg}</p>
<table class="table table-bordered">

    <thead>
    <tr>
        <th>id</th>
        <th>ten</th>
        <th>action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listDanhMuc}" var="listdanhmuc">
        <tr>
            <td>${listdanhmuc.idDanhMuc}</td>
            <td>${listdanhmuc.tenDanhMuc}</td>
            <td><a href="/danhmuc/edit/${listdanhmuc.idDanhMuc}">
                <button type="submit" class="btn badge-info"><i class="fa fa-edit"></i></button></a></td>
            <td><a href="/danhmuc/delete/${listdanhmuc.idDanhMuc}">
                <button type="submit" class="btn btn-danger"><i class="fa fa-trash"></i></button></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
