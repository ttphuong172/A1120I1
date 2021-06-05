<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/5/2021
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:if test="${empty error}">
    <h3>Phép toán: ${result}</h3>
</c:if>
<c:if test="${not empty error}">
    <h3>${error}</h3>
</c:if>


</body>
</html>
