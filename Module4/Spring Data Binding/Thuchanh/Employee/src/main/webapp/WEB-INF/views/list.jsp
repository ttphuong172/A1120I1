<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 20/07/2021
  Time: 9:57 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Danh sach nhan vien</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<div class="container">
    <h3>Danh sách nhân viên</h3>
<table class="table">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>ContactNumber</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeeList}" var="employeelist">
        <tr>
            <td>${employeelist.id}</td>
            <td>${employeelist.name}</td>
            <td>${employeelist.contactNumber}</td>
            <td><a href="/employee/edit/${employeelist.id}"><button  class="btn btn-info"><i class="fa fa-edit"></i></button></a></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
