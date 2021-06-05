<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/5/2021
  Time: 8:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
 <c:if test="${empty result}">
    <h3>
        Ko co gia tri can tim
    </h3>
 </c:if>

<c:if test="${not empty result}">
<h3>
   Từ cần tìm:
    <c:out value="${search}"></c:out>
</h3>
<h3>
    Kết quả:
    <c:out value="${result}"></c:out>
</h3>
</c:if>
</div>
</body>
</html>
