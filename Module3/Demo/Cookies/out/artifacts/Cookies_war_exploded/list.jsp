<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/6/2021
  Time: 8:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<a href="?action=create" role="button">Add</a>
<form action="">
    <input type="hidden" name="action" value="search">
    <label for="">Giá cho thuê</label>
    <input type="text" name="giachothue">
    <label for="">Dien tich</label>
    <input type="text" name="dientich">
    <input type="submit" value="TÌM KIẾM">
</form>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Dien tich</th>
        <th>Ngay BD</th>
        <th>Ngay KT</th>
        <th>Giá</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${empty listSearch}">
        <c:forEach items="${list}" var="list">
            <tr>
                <td>${list.id}</td>
                <td>${list.dienTich}</td>
                <td>
                    <fmt:parseDate value="${list.ngayBatDau}" pattern="yyyy/MM/dd" var="ngaybatdau"/>
                    <fmt:formatDate value="${ngaybatdau}" pattern="dd/MM/yyyy"/>
                </td>

                <td>

                    <fmt:parseDate value="${list.ngayKetThuc}" pattern="yyyy/MM/dd" var="ngayketthuc"/>
                    <fmt:formatDate value="${ngayketthuc}" pattern="dd/MM/yyyy"/>

                </td>
                <td>${list.giaChoThue}</td>
            </tr>
        </c:forEach>
    </c:if>

    <c:if test="${not empty listSearch}">
        <c:forEach items="${listSearch}" var="listsearch">
            <tr>
                <td>${listsearch.id}</td>
                <td>${listsearch.dienTich}</td>
                <td>${listsearch.ngayBatDau}</td>
                <td>${listsearch.ngayKetThuc}</td>
                <td>${listsearch.giaChoThue}</td>
            </tr>
        </c:forEach>
    </c:if>

    </tbody>
</table>
</body>
</html>
