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
    <title>List Customer</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap4.css">
    <link rel="stylesheet" href="/css/main.css">



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
            <h3>Thông tin khách hàng</h3>
            <a href="/customer?action=create">
                <button class="btn btn-primary">Thêm mới</button>
            </a>
            <div>
                <p>Tìm kiếm sản phẩm</p>
                <form action="/customer?action=find" method="post">
                    <input type="text" name="find">
                    <input type="submit" value="TÌM KIẾM">
                </form>
            </div>


            <table id="customer" class="table table-striped table-bordered">
                <thead>
                <tr>
                    <th>Mã KH</th>
                    <th>Tên KH</th>
                    <th>Ngày sinh</th>
                    <th>Số CMND</th>
                    <th>Số ĐT</th>
                    <th>Email</th>
                    <th>Loại KH</th>
                    <th>Địa chỉ</th>
                    <th>Sửa</th>
                    <th>Xóa</th>
                </tr>
                </thead>

                <tbody>
                <c:if test="${empty customer}">
                    <c:forEach items="${customerList}" var="customerlist">
                        <tr>
                            <td>${customerlist.customerId}</td>
                            <td>${customerlist.customerName}</td>
                            <td>${customerlist.birthday}</td>
                            <td>${customerlist.idCard}</td>
                            <td>${customerlist.phoneNumber}</td>
                            <td>${customerlist.email}</td>
                            <c:forEach items="${customerTypeList}" var="customertypelist">
                                <c:if test="${customertypelist.customerTypeId==customerlist.customertypeid}">
                                    <td>${customertypelist.customerTypeName}</td>
                                </c:if>
                            </c:forEach>
                            <td>${customerlist.address}</td>
                            <td><a href="/customer?action=edit&id=${customerlist.customerId}">
                                <button class="btn btn-warning">Edit</button>
                            </a></td>
                            <td>
<%--                                <a href="/customer?action=delete&id=${customerlist.customerId}">--%>
<%--                                <button class="btn btn-danger">DELETE</button>--%>
<%--                            </a>--%>
                            <a class="btn btn-danger" href="#" role="button" data-toggle="modal" data-target="#modelDelete" onClick="onDelete(${customerlist.customerId});nameDelete('${customerlist.customerName}')">
                                Delete
                            </a>
                            </td>
                            <!-- Button trigger modal -->


                            <!-- Modal -->
                            <div class="modal fade" id="modelDelete" tabindex="-1" role="dialog"
                                 aria-labelledby="modelTitleId" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title">Modal title</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <form action="/customer">
                                            <input type="hidden" name="id" value="" id="idCustomerDelete">
                                            <input type="hidden" name="action" value="delete">
                                        <div class="modal-body">
                                            <p id="body"></p>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-primary" data-dismiss="modal">Cancel
                                            </button>
                                            <button type="submit" class="btn btn-danger">Delete</button>
                                        </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </tr>
                    </c:forEach>
                </c:if>
                </tbody>

                <c:if test="${not empty customer}">
                <tr>
                    <td>${customer.customerId}</td>
                    <td>${customer.customerName}</td>
                    <td>${customer.birthday}</td>
                    <td>${customer.idCard}</td>
                    <td>${customer.phoneNumber}</td>
                    <td>${customer.email}</td>

                    <c:forEach items="${customerTypeList}" var="customertypelist">
                    <c:if test="${customertypelist.customerTypeId==customer.customertypeid}">
                    <td>${customertypelist.customerTypeName}</td>
                    </c:if>
                    </c:forEach>

                    <td>${customerlist.address}</td>
                    <td><a href="/customer?action=edit&id=${customer.customerId}">
                        <button class="btn btn-warning">EDIT</button>
                    </a></td>
                    <td><a href="/customer?action=delete&id=${customer.customerId}">
                        <button class="btn btn-danger">DELETE</button>
                    </a></td>
                    </c:if>

            </table>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>

<script src="/js/jquery-3.5.1.min.js"></script>
<script src="/js/bootstrap.js"></script>
<script src="/datatables/js/jquery.dataTables.js"></script>
<script src="/datatables/js/dataTables.bootstrap4.js"></script>

<script>
    $(document).ready(function () {
        $('#customer').dataTable({
            "dom": 'lrtip',
            'pageLength': 10
        });
    })
    function onDelete(idDelete) {
        document.getElementById("idCustomerDelete").value = idDelete;
    }
    function nameDelete(nameDelete) {
        document.getElementById("body").innerHTML = "Bạn có muốn xóa "+nameDelete+" ?";
    }

</script>
</body>
</html>
