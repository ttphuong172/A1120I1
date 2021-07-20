<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 20/07/2021
  Time: 7:58 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Home</h3>
<form:form action="/login" method="post" modelAttribute="login">
<label for="">Account</label>
<form:input type="text" path="account"/>
<br>
<br>
<label for="">Password</label>
<form:input type="text" path="password"/>
<br>
<br>
<input type="submit" value="Login">
</form:form>
</body>
</html>
