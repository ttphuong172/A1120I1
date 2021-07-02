<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/1/2021
  Time: 4:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dang ky vang nghi</title>
</head>
<body>

    <table>
        <tr>
            <td><label for="">Mã HS</label></td>
            <td>
                <input type="text" name="studentid" value="${student.studentId} ">
            </td>
            <td><label for="">Tên HS</label></td>
            <td>
                <input type="text" name="studentname" value="${student.studentName}">
            </td>
        </tr>
        <tr>
            <td><label for="">Giới tính</label></td>
            <td>
                <c:if test="${student.gender==1}">
                <input type="text" value="Nam">
                </c:if>
                <c:if test="${student.gender==0}">
                    <input type="text" value="Nữ">
                </c:if>
            </td>
            <td><label for="">Ngày sinh</label></td>
            <td><input type="text" name="birthday" value="${student.birthday}"></td>
        </tr>
        <tr>
            <td><label for="">Từ ngày</label></td>
            <td><input type="date"></td>
            <td><label for="">Đến ngày</label></td>
            <td><input type="date"></td>
        </tr>
        <tr>
            <td><label for="">Thời gian đăng ký</label></td>
            <td><input type="datetime-local"></td>
            <td><label for="">Lý do nghỉ</label></td>
            <td><input type="text"></td>
        </tr>
        <tr>
            <td><label for="">Nguồn</label></td>
            <td><input type="text"></td>
            <td><label for="">Ghi chú</label></td>
            <td><input type="text"></td>
        </tr>
    </table>

</body>
</html>
