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
    <title>List Contract Detail</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap4.css">
    <link rel="stylesheet" href="/css/main.css">
    <script src="/js/jquery-3.5.1.min.js"></script>
    <script src="/js/bootstrap.js"></script>
    <script src="/datatables/js/jquery.dataTables.js"></script>
    <script src="/datatables/js/dataTables.bootstrap4.js"></script>


</head>
<body>
<div class="container-fluid">
    <jsp:include page="../header.jsp"/>
    <div id="main" class="row">
        <div class="sidebar col-sm-2">
            sidebar
        </div>
        <div class="bodyarea col-sm-10">
            <h3>Thông tin hợp đồng</h3>
            <a href="/contractdetail?action=create">
                <button class="btn btn-primary">Thêm mới</button>
            </a>
            <div>
                <p>Tìm kiếm hợp đồng</p>
                <form action="/contract?action=find" method="post">
                    <input type="text" name="find" value="${valuefind}" id="find">
                    <input type="submit" value="TÌM KIẾM">
                </form>
            </div>


            <table id="customer" class="table table-striped table-bordered">
                <thead>
                <tr>
                    <th>Mã HĐCT</th>
                    <th>Tên DVGT</th>
                    <th>Mã HĐ</th>
                    <th>Tên KH</th>
                    <th>Detail</th>
                    <th>Sửa</th>
                    <th>Xóa</th>
                    <th>Số lượng</th>

                </tr>
                </thead>

                <tbody>

                    <c:forEach items="${detailContractList}" var="detailcontractlist">
                        <tr>
                            <td>${detailcontractlist.detailContractId}</td>
                            <td>${detailcontractlist.attachService.attachServiceName}</td>
                            <td>${detailcontractlist.contract.contractId}</td>
                            <td>${detailcontractlist.contract.customer.customerName}</td>
                            <td>${detailcontractlist.quantity}</td>

                            <td><a href="" class="btn btn-primary" role="button">Detail</a></td>
                            <td><a href="/contractdetail?action=edit&id=${detailcontractlist.detailContractId}" class="btn btn-warning" role="button">Edit</a></td>
                            <td><a href="#" data-toggle="modal" data-target="#modelDelete" class="btn btn-danger" onclick="onDelete(${detailcontractlist.detailContractId})" role="button">Delete</a></td>
                        </tr>

                    </c:forEach>





                <!-- Modal Delete -->
                <div class="modal fade" id="modelDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Modal title</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <form action="/contractdetail">
                                <input type="hidden" name="action" value="delete">
                                <input type="hidden" name="id" value="" id="idContractDelete">
                                <div class="modal-body">
                                    <p id="nameDelete"></p>
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                </tbody>



            </table>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>



<script>
    $(document).ready(function () {
        $('#customer').dataTable({
            "dom": 'lrtip',
            'pageLength': 10
        });

    })

    function Value(idmodal,namemodal,birthdaymodal,idcardmodal,phonenumber,email,typename,address) {
        document.getElementById("idmodal").innerHTML = idmodal;
        document.getElementById("namemodal").innerHTML = namemodal;
        document.getElementById("birthdaymodal").innerHTML = birthdaymodal;
        document.getElementById("idcardmodal").innerHTML = idcardmodal;
        document.getElementById("phonenumbermodal").innerHTML = phonenumber;
        document.getElementById("emailmodal").innerHTML = email;
        document.getElementById("typenamemodal").innerHTML = typename;
        document.getElementById("addressmodal").innerHTML = address;
    }

    function onDelete(idDelete) {
        document.getElementById("idContractDelete").value = idDelete;
        document.getElementById("nameDelete").innerHTML = "Bạn có muốn xóa " + idDelete + " ?";
    }

</script>
</body>
</html>
