<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 20/07/2021
  Time: 3:21 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả</title>
</head>
<body>
    <span>Languages: </span>
    <span>${emailSetting.languages}</span>
    <br>
    <br>
    <span>Page size: </span>
    <span>${emailSetting.pageSize}</span>
    <br>
    <br>
    <span>Spams Filter</span>
    <span>${emailSetting.spamsFilter}</span>
    <br>
    <br>
    <span>Signature</span>
    <span>${emailSetting.signature}</span>
</body>
</html>
