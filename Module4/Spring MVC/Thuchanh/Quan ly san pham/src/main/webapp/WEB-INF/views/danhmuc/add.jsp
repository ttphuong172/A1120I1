<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 16/07/2021
  Time: 3:07 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Them moi danh muc</title>
</head>
<body>
<h3>Them moi danh muc</h3>
<form:form action="/danhmuc/save" method="post" modelAttribute="danhMuc">
    <label for="">ID Danh muc</label>
    <form:input type="text" path="idDanhMuc" />
    <label for="">Ten Danh muc</label>
    <form:input type="text" path="tenDanhMuc" />
    <input type="submit" value="Save">
</form:form>

</body>
</html>
