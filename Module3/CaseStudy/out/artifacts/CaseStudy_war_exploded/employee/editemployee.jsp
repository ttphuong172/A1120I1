<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/8/2021
  Time: 12:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Employee</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
    <link rel="stylesheet" href="../css/main.css">
</head>
<body>
<div class="container-fluid">
    <jsp:include page="../header.jsp"/>
    <div id="main" class="row">
        <div class="sidebar col-sm-2" style="height: 500px;">
            sidebar
        </div>
        <div class="bodyarea col-sm-10" style="height: 500px;">
            <h3>Chỉnh sửa nhân viên</h3>
            <form action="/employee?action=update" method="post">
                <table class="table">
                    <tr>
                        <td><label for="">Mã NV</label></td>
                        <td>
                            <input type="text" name="employeeid" value="${employee.employeeId}" class="form-control">
                        </td>
                    </tr>
                    <tr>
                        <td width="15%"><label for="">Họ tên nhân viên</label></td>
                        <td width="30%"><input type="text" name="name" value="${employee.name}" class="form-control"></td>
                        <td width="15%"><label for="">Ngày sinh</label></td>
                        <td width="30%"><input type="text" name="birthday" value="${employee.birthday}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Số CMND</label></td>
                        <td><input type="text" name="idcard" value="${employee.cardId}" class="form-control"></td>
                        <td><label for="">Số điện thoại</label></td>
                        <td><input type="text" name="phonenumber" value="${employee.phoneNumber}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Email</label></td>
                        <td><input type="text" name="email" value="${employee.email}" class="form-control"></td>
                        <td><label for="">Level</label></td>
                        <td>

                            <select name="level" id="" class="custom-select">
                                <c:forEach items="${levelList}" var="levellist">
                                    <option value="${levellist.levelId}"
                                            <c:if test="${employee.level.levelId==levellist.levelId}">
                                                selected
                                            </c:if>
                                    >${levellist.levelName} </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="">Department</label></td>
                        <td>
                            <select name="department" id="" class="custom-select">
                                <c:forEach items="${departmentList}" var="departmentlist">
                                    <option value="${departmentlist.departmentId}"
                                            <c:if test="${employee.department.departmentId==departmentlist.departmentId}">
                                                selected
                                            </c:if>
                                    >${departmentlist.departmentName}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td><label for="">Bằng cấp</label></td>
                        <td>
                            <select name="diploma" id="" class="custom-select">
                                <c:forEach items="${diplomaList}" var="diplomalist">
                                    <option value="${diplomalist.diplomaId}"
                                            <c:if test="${employee.diploma.diplomaId==diplomalist.diplomaId}">
                                                selected
                                            </c:if>
                                    >${diplomalist.diplomaName}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="">Lương</label></td>
                        <td>
                            <input type="text" name="salary" value="${employee.salary}" class="form-control">
                        </td>
                        <td><label for="">Địa chỉ</label></td>
                        <td>
                            <input type="text" name="address" value="${employee.address}" class="form-control">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td> <input class="btn btn-primary" type="submit" value="Cập nhật"></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

    <div id="footer">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>

</body>
</html>
