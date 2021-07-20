<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 20/07/2021
  Time: 1:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        label{
            display: inline-block;
            width: 150px;
        }
    </style>
</head>
<body>
<h3>Setting</h3>
<form:form action="/update" method="post" modelAttribute="emailSetting">
    <label for="">Languages: </label>
    <form:select path="languages">
        <form:options items="${languageList}"/>
    </form:select>
    <br>
    <br>
    <label for="">Page size</label>
    <form:select path="pageSize">
        <label>Show </label>
        <form:options items="${pageSizeList}"/>
        <label>emails per page</label>
    </form:select>
    <br>
    <br>
    <label for="">Spams filter</label>
    <form:checkbox path="spamsFilter" />
    <br>
    <br>
    <label for="">Signature</label>
    <form:textarea path="signature"/>
    <br>
    <br>
    <label for=""></label>
    <input type="submit" value="Update">
</form:form>
</body>
</html>
