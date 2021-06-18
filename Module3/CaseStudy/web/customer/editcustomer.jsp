<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/7/2021
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


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
<div class="container-fluid pt-5">
    <div id="header" class="row">
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
            <h3>Chỉnh sửa khách hàng</h3>
            <form action="/customer?action=edit" method="post" class="form-group">
                <table  class="table">
                    <tr>
                        <td width="20%"><label for="">Mã khách hàng</label></td>
                        <td width="80%"><input type="text" name="idcustomer" value="${customer.customerId}" class="form-control" readonly="readonly" ></td>
                    </tr>
                    <tr>
                        <td><label for="">Họ tên khách hàng</label></td>
                        <td><input type="text" name="namecustomer" value="${customer.customerName}" class="form-control" ></td>
                    </tr>
                    <tr>
                        <td><label for="">Ngày sinh</label></td>
                        <td><input type="text" name="birthday" value="${customer.birthday}" class="form-control"></td>

                    </tr>
                    <tr>
                        <td><label for="">Số CMND</label></td>
                        <td><input type="text" name ="idcard" value="${customer.idCard}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Địa chỉ</label></td>
                        <td><input type="text" name="address" value="${customer.address}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Số điện thoại</label></td>
                        <td><input type="text" name="phonenumber" value="${customer.phoneNumber}"  class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Email</label></td>
                        <td><input type="text" name="email"  value="${customer.email}" class="form-control"></td>
                    </tr>
                    <tr>
                        <td><label for="">Loại khách hàng</label></td>

                        <td>
                            <select name="customertype" class="custom-select">
                                <c:forEach items="${customerTypeList}" var="customertypelist">
                                    <option value="${customertypelist.customerTypeId}"
                                            <c:if test="${customertypelist.customerTypeId==customer.customertypeid}">
                                                selected
                                            </c:if>
                                    > ${customertypelist.customerTypeName}</option>
                                </c:forEach>
                            </select>
                        </td>

                    </tr>
                    <tr>
                        <td></td>
                        <td> <input class="btn btn-primary" type="submit" value="CẬP NHẬT"></td>
                    </tr>

                </table>
            </form>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>
</body>
</html>
