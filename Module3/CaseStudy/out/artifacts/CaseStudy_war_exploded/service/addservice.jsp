<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/14/2021
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add Service</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
    <link rel="stylesheet" href="../css/main.css">


</head>
<body>
<div class="container-fluid pt-5">
    <div id="header" class="row" style="background-color: #50af50">
        <div class="logo col-sm-10">
            <img src="../img/logo.jpg" alt="logo">
        </div>
        <div class="name col-sm-2">
            <h3>name</h3>
        </div>
    </div>
    <div id="nav" class="row">
        <div class="menu col-sm-8">
            <ul>
                <a href="">
                    <li>Home</li>
                </a>
                <a href="">
                    <li>Employee</li>
                </a>
                <a href="/customer">
                    <li>Customer</li>
                </a>
                <a href="">
                    <li>Service</li>
                </a>
                <a href="">
                    <li>Contract</li>
                </a>
            </ul>
        </div>
        <div class="input_icon col-sm-4">
            <input type="text" id="search" placeholder="search">
            <i class="icon fas fa-search"></i>
        </div>
    </div>

    <div id="main" class="row">
        <div class="sidebar col-sm-2">
            sidebar
        </div>
        <div class="bodyarea col-sm-10">
            <h3>Thêm mới dịch vụ</h3>
            <form action="/service?action=create" method="post">
                <div>
                    <fieldset class="scheduler-border">
                        <legend class="scheduler-border">Thông tin chung</legend>
                        <table>
                            <tr>
                                <td width="15%"><label for="">Mã dịch vụ</label></td>
                                <td width="30%"><input type="text" name="serviceid" class="form-control"></td>
                                <td width="15%"><label for="">Loại dịch vụ</label></td>
                                <td width="30%">
                                    <select name="servicetypeid" class="custom-select">
                                        <c:forEach items="${serviceTypeList}" var="servicetypelist">
                                            <option value="${servicetypelist.serviceTypeId}">
                                                    ${servicetypelist.serviceTypeName}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </td>
                            </tr>
                            <tr>
                                <td><label for="">Tên dịch vụ</label></td>
                                <td><input type="text" name="servicename" class="form-control"></td>
                                <td><label for="">Diện tích sử dụng</label></td>
                                <td><input type="text" name="usearea" class="form-control"></td>
                            </tr>
                            <tr>
                                <td><label for="">Giá cho thuê</label></td>
                                <td><input type="text" name="rentalprice" class="form-control"></td>
                                <td><label for="">Số người tối đa</label></td>
                                <td><input type="text" name="maxperson" class="form-control"></td>
                            </tr>
                            <tr>
                                <td><label for="">Hình thức thuê</label></td>
                                <td>
                                    <select name="rentalformid" id="" class="custom-select">
                                        <c:forEach items="${rentalFormList}" var="rentalformlist">
                                            <option value="${rentalformlist.rentalFormId}">
                                                    ${rentalformlist.rentalFormName}
                                            </option>
                                        </c:forEach>
                                    </select>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <div>
                    <fieldset class="scheduler-border">
                        <legend class="scheduler-border">Villa</legend>
                        <table>
                            <tr>
                                <td width="15%"><label for="">Tiêu chuẩn phòng</label></td>
                                <td width="30%">
                                    <select name="villahousestandardid" id="" class="custom-select">
                                        <c:forEach items="${villaHouseStandardList}" var="villahousestandardlist">
                                            <option value="${villahousestandardlist.villaHouseStandardId}">
                                                    ${villahousestandardlist.villaHouseStandardName}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </td>
                                <td width="15%"><label for="">Tiện nghi khác</label></td>
                                <td width="30%"><input type="text" name="otherconvenientvillahouse"
                                                       class="form-control"></td>
                            </tr>
                            <tr>
                                <td><label for="">Diện tích hồ bơi</label></td>
                                <td><input type="number" name="pollvillaarea" class="form-control"></td>
                                <td><label for="">Số tầng</label></td>
                                <td><input type="number" name="numberfloorvillahouse" class="form-control"></td>
                            </tr>
                        </table>
                    </fieldset>
                    <fieldset class="scheduler-border">
                        <legend class="scheduler-border">Room</legend>
                        <table>
                            <tr>
                                <td width="15%"><label for="">Dịch vụ miễn phí</label></td>
                                <td width="30%"><input type="text" name="freeserviceroom" class="form-control"></td>
                                <td width="15%"></td>
                                <td width="30%"></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <td>
                    <a href="/">
                        <button class="btn btn-primary">Thêm mới</button>
                    </a>
                </td>
            </form>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>
</body>
</html>
