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
    <title>List Service</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
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
            <h3>Thông tin dịch vụ</h3>
            <a href="/service?action=create">
                <button class="btn btn-primary">Thêm mới</button>
            </a>
            <div>
                <p>Tìm kiếm dịch vụ</p>
                <form action="/customer?action=find" method="post">
                    <input type="text" name="find">
                    <input type="submit" value="TÌM KIẾM">
                </form>
                <table class="table">
                    <tr>
                        <th>Mã DV</th>
                        <th>Mã Loại DV</th>
                        <th>Tên DV</th>
                        <th>Diện tích</th>
                        <th>Giá thuê</th>
                        <th>Số người</th>
                        <th>Hình thức thuê</th>
                        <th>Tiêu chuẩn</th>
                        <th>Tiện ích khác</th>
                        <th>Diện tích hồ bơi</th>
                        <th>Số tầng</th>
                        <th>Dịch vụ miễn phí</th>
                        <th>Sửa</th>
                        <th>Xóa</th>
                    </tr>
                    <c:forEach items="${serviceList}" var="servicelist">
                        <tr>
                            <td>${servicelist.serviceId}</td>

                            <td>
                                <c:forEach items="${serviceTypeList}" var="servicetypelist">
                                    <c:if test="${servicelist.serviceTypeId==servicetypelist.serviceTypeId}">
                                        ${servicetypelist.serviceTypeName}
                                    </c:if>
                                </c:forEach>
                            </td>

                            <td>${servicelist.serviceName}</td>
                            <td>${servicelist.useArea}</td>
                            <td>${servicelist.rentalPrice}</td>
                            <td>${servicelist.maxPerson}</td>
                            <td>
                                <c:forEach items="${rentalFormList}" var="rentalformlist">
                                    <c:if test="${servicelist.rentalFormId==rentalformlist.rentalFormId}">
                                        ${rentalformlist.rentalFormName}
                                    </c:if>
                                </c:forEach>
                            </td>
                            <td>
                                <c:forEach items="${villaHouseStandardList}" var="villahousestandardlist">
                                    <c:if test="${servicelist.villaHouseStandardId==villahousestandardlist.villaHouseStandardId}">
                                        ${villahousestandardlist.villaHouseStandardName}
                                    </c:if>
                                </c:forEach>
                            </td>

                            <td>${servicelist.otherConvenientVillaHouse}</td>

                            <td>
                                <c:if test="${servicelist.pollVillaArea==0}">-</c:if>
                                <c:if test="${servicelist.pollVillaArea!=0}">
                                    ${servicelist.pollVillaArea}
                                </c:if>
                            </td>


                            <td>
                                <c:if test="${servicelist.numberFloorVillaHouse==0}">-</c:if>
                                <c:if test="${servicelist.numberFloorVillaHouse!=0}">
                                    ${servicelist.numberFloorVillaHouse}
                                </c:if>
                            </td>

                            <td>
                                <c:if test="${servicelist.freeServiceRoom==null}">-</c:if>
                                <c:if test="${servicelist.freeServiceRoom!=null}">
                                    ${servicelist.freeServiceRoom}
                                </c:if>
                            </td>


                            <td>
                                <a href="/service?action=edit&id=${servicelist.serviceId}">
                                    <button class="btn btn-warning">Sửa</button>
                                </a>
                            </td>
                            <td>
                                <a href="/service?action=delete&id=${servicelist.serviceId}">
                                    <button onclick="return confirm('Are you sure?')" class="btn btn-danger">Xóa
                                    </button>
                                </a>
                            </td>

                        </tr>

                    </c:forEach>
                </table>
            </div>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>
</body>
</html>
