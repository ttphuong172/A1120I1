<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/1/2021
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Đăng ký vắng nghỉ</title>
</head>
<body>
<table>
    <tr>
        <form action="/register?action=search" method="post">
            <td><label for="">Lớp</label></td>
            <td>
                <select name="classesid" id="">
                    <c:forEach items="${listClasses}" var="listclasses">
                        <option value="${listclasses.classID}">
                                ${listclasses.className}
                        </option>
                    </c:forEach>
                </select>
            </td>
            <td><input type="submit" value="Tìm kiếm"></td>
        </form>
    </tr>
</table>

<table>
    <thead>
    <tr>
        <th>Mã SV</th>
        <th>Tên SV</th>
        <th>Đăng ký</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${listStudent}" var="liststudent">
        <tr>
            <td>${liststudent.studentId}</td>
            <td>${liststudent.studentName}</td>
            <td><a href="/register?action=dangky&id=${liststudent.studentId}" role="button">Đăng ký</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
