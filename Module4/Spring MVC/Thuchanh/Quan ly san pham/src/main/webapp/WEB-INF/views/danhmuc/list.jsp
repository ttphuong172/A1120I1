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
</head>
<body>
<h3>Danh sách danh mục</h3>
<a href="/danhmuc/create"><input type="submit" value="Add Danh Muc"></a>
<p style="color: green">${msg}</p>
<table>
    <thead>
    <tr>
        <th>id</th>
        <th>ten</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listDanhMuc}" var="listdanhmuc">
        <tr>
            <td>${listdanhmuc.idDanhMuc}</td>
            <td>${listdanhmuc.tenDanhMuc}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
