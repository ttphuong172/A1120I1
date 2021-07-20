<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 16/07/2021
  Time: 9:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Chinh sua danh muc</h3>
<form:form action="/danhmuc/update" method="post" modelAttribute="danhMuc">
    <label for="">ID Danh muc</label>
    <form:input type="text"  path="idDanhMuc" value="${danhMuc.idDanhMuc}" />
    <label for="">Ten Danh muc</label>
    <form:input type="text" path="tenDanhMuc" value="${danhMuc.tenDanhMuc}"/>
    <input type="submit" value="Update">
</form:form>
</body>
</html>
