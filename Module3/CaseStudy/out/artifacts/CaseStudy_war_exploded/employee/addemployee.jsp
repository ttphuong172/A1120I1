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
    <title>Add Employee</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
    <link rel="stylesheet" href="../css/main.css">
</head>
<body>
<div class="container-fluid pt-5">
    <jsp:include page="../header.jsp"/>
    <div id="main" class="row">
        <div class="sidebar col-sm-2" style="height: 500px;">
            sidebar
        </div>
        <div class="bodyarea col-sm-10" style="height: 500px;">
            <h3>Thêm mới nhân viên</h3>
            <form action="/employee?action=create" method="post">
                <table class="table">
                    <tr>
                        <td width="15%"><label for="">Họ tên nhân viên</label></td>
                        <td width="30%"><input type="text" name="nameemployee" class="form-control"></td>
                        <td width="15%"><label for="">Ngày sinh</label></td>
                        <td width="30%"><input type="date" name="birthday" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Số CMND</label></td>
                        <td><input type="text" name="idcard" class="form-control"></td>
                        <td><label for="">Số điện thoại</label></td>
                        <td><input type="text" name="phonenumber" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Email</label></td>
                        <td><input type="text" name="email" class="form-control"></td>
                        <td><label for="">Level</label></td>
                        <td>
                            <select name="level" id="" class="custom-select">
                                <c:forEach items="${levelList}" var="levellist">
                                    <option value="${levellist.levelId}">${levellist.levelName} </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="">Department</label></td>
                        <td>
                            <select name="department" id="" class="custom-select">
                                <c:forEach items="${departmentList}" var="departmentlist">
                                    <option value="${departmentlist.departmentId}">${departmentlist.departmentName}</option>
                                </c:forEach>
                            </select>
                        </td>
                        <td><label for="">Bằng cấp</label></td>
                        <td>
                            <select name="diploma" id="" class="custom-select">
                                <c:forEach items="${diplomaList}" var="diplomalist">
                                    <option value="${diplomalist.diplomaId}">${diplomalist.diplomaName}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="">Lương</label></td>
                        <td>
                            <input type="text" name="salary" class="form-control">
                        </td>
                        <td><label for="">Địa chỉ</label></td>
                        <td>
                            <input type="text" name="address" class="form-control">
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td> <input class="btn btn-primary" type="submit" value="Thêm mới"></td>
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
