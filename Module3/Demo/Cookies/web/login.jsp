<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/2/2021
  Time: 8:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login Page</title>
    <style>
        label {
            display: inline-block;
            width: 120px;
        }
    </style>
</head>
<body>
<h3>Đăng nhập</h3>
<form action="/login" method="post">

    <label for="">Tên đăng nhập</label>

    <input type="text" name="username"
    <c:forEach items="${cookies}" var="cookies">
         <c:if test="${cookies.getName()=='username'}">
            value="${cookies.getValue()}"
         </c:if>
    </c:forEach>
    >

    <br>
    <br>
    <label for="">Mật khẩu</label>
    <input type="text" name="password"
    <c:forEach items="${cookies}" var="cookies">
    <c:if test="${cookies.getName()=='password'}">
           value="${cookies.getValue()}"
    </c:if>
    </c:forEach>
    >
    <br>
    <br>
    <label for="">Remember Me</label>
    <input type="checkbox" name="remember"
    <c:forEach items="${cookies}" var="cookies">
    <c:if test="${cookies.getValue()=='on'}">
           checked
    </c:if>
    </c:forEach>
    >
    <br>
    <br>
    <label for=""></label>
    <input type="submit" value="Đăng nhập">

</form>
</body>
</html>
