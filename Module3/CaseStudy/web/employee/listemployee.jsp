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
    <title>List Employee</title>
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
            <h3>Thông tin nhân viên</h3>
            <a href="/employee?action=create">
                <button class="btn btn-primary">Thêm mới</button>
            </a>
            <div>
                <p>Tìm kiếm dịch vụ</p>
                <form action="/employee?action=find" method="post">
                    <input type="text" name="find">
                    <input type="submit" value="TÌM KIẾM">
                </form>

                <c:if test="${employee==null}">

                <table class="table table-striped table-bordered" id="employeeTable" style="width: 100%;">
                    <thead>
                    <tr>
                        <th>Mã NV</th>
                        <th>Tên NV</th>
                        <%--                        <th>Ngày sinh</th>--%>
                        <%--                        <th>Số CMND</th>--%>
                        <th>Số ĐT</th>
                        <%--                        <th>Email</th>--%>
                        <th>Level</th>
                        <th>Department</th>
                        <%--                        <th>Diploma</th>--%>
                        <%--                        <th>Lương</th>--%>
                        <th>Địa chỉ</th>
                        <th>Chi tiết</th>
                        <th>Sửa</th>
                        <th>Xóa</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${employeeList}" var="employeelist">
                        <tr>
                            <td>
                                <span class="id">${employeelist.employeeId}</span>
                            </td>
                            <td>
                                <span class="name">${employeelist.name}</span>
                            </td>
                                <%--                            <td>${employeelist.birthday}</td>--%>
                                <%--                            <td>${employeelist.cardId}</td>--%>
                            <td>${employeelist.phoneNumber}</td>
                                <%--                            <td>${employeelist.email}</td>--%>
                            <td>${employeelist.level.levelName}</td>
                            <td>${employeelist.department.departmentName}</td>
                                <%--                            <td>${employeelist.diploma.diplomaName}</td>--%>
                                <%--                            <td>${employeelist.salary}</td>--%>
                            <td>${employeelist.address}</td>
                            <td><a class="btn btn-primary" id="detail" href="" data-toggle="modal"
                                   data-target="#modelDetail"
                                   onclick="value(${employeelist.employeeId},'${employeelist.name}','${employeelist.birthday}'
                                           ,${employeelist.cardId},${employeelist.phoneNumber},'${employeelist.email}',
                                           '${employeelist.level.levelName}','${employeelist.department.departmentName}'
                                           ,'${employeelist.diploma.diplomaName}',${employeelist.salary},'${employeelist.address}')">Detail</a>
                            </td>
                            <td><a class="btn btn-warning" href="/employee?action=update&id=${employeelist.employeeId}"
                                   role="button">Edit</a></td>
                            <td><a class="btn btn-danger" href="#"
                                   role="button" data-toggle="modal" data-target="#modelDelete"
                                   onclick="idDelete(${employeelist.employeeId});nameDelete('${employeelist.name}')">Delete</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                </c:if>


<%--                KET QUA TIM KIEM--%>
                <c:if test="${not empty employee}">
                    <table class="table table-striped table-bordered" id="employeeTable" style="width: 100%;">
                        <thead>
                        <tr>
                            <th>Mã NV</th>
                            <th>Tên NV</th>
                                <%--                        <th>Ngày sinh</th>--%>
                                <%--                        <th>Số CMND</th>--%>
                            <th>Số ĐT</th>
                                <%--                        <th>Email</th>--%>
                            <th>Level</th>
                            <th>Department</th>
                                <%--                        <th>Diploma</th>--%>
                                <%--                        <th>Lương</th>--%>
                            <th>Địa chỉ</th>
                            <th>Chi tiết</th>
                            <th>Sửa</th>
                            <th>Xóa</th>
                        </tr>
                        </thead>
                        <tbody>

                            <tr>
                                <td>
                                    <span class="id">${employee.employeeId}</span>
                                </td>
                                <td>
                                    <span class="name">${employee.name}</span>
                                </td>
                                    <%--                            <td>${employeelist.birthday}</td>--%>
                                    <%--                            <td>${employeelist.cardId}</td>--%>
                                <td>${employee.phoneNumber}</td>
                                    <%--                            <td>${employeelist.email}</td>--%>
                                <td>${employee.level.levelName}</td>
                                <td>${employee.department.departmentName}</td>
                                    <%--                            <td>${employeelist.diploma.diplomaName}</td>--%>
                                    <%--                            <td>${employeelist.salary}</td>--%>
                                <td>${employee.address}</td>
                                <td><a class="btn btn-primary" id="detailfind" href="" data-toggle="modal"
                                       data-target="#modelDetail"
                                       onclick="value(${employee.employeeId},'${employee.name}','${employee.birthday}'
                                               ,${employee.cardId},${employee.phoneNumber},'${employee.email}',
                                               '${employee.level.levelName}','${employee.department.departmentName}'
                                               ,'${employee.diploma.diplomaName}',${employee.salary},'${employee.address}')">Detail</a>
                                </td>
                                <td><a class="btn btn-warning" href="/employee?action=update&id=${employee.employeeId}"
                                       role="button">Edit</a></td>
                                <td><a class="btn btn-danger" href="#"
                                       role="button" data-toggle="modal" data-target="#modelDelete"
                                       onclick="idDelete(${employee.employeeId});nameDelete('${employee.name}')">Delete</a>
                                </td>
                            </tr>

                        </tbody>
                    </table>
                </c:if>

                <!-- Modal Delete-->
                <div class="modal fade" id="modelDelete" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Xác nhận xóa </h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <form action="">
                                <input type="hidden" name="action" value="delete">
                                <input type="hidden" name="id" value="" id="idemployeeDelete">
                                <div class="modal-body">
                                    <span id="body"></span>
                                </div>
                                <div class="modal-footer">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                    <button type="button" class="btn btn-primary" data-dismiss="modal">Cancel</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
                <!-- Modal Detail -->
                <div class="modal fade" id="modelDetail" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
                     aria-hidden="true">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Thông tin chi tiết nhân viên</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <label for="">Mã nhân viên: </label>
                                <label id="idmodal"></label>
                                <br>
                                <label for="">Tên nhân viên: </label>
                                <label id="namemodal"></label>
                                <br>
                                <label for="">Ngày sinh: </label>
                                <label id="birthdaymodal"></label>
                                <br>
                                <label for="">Số CMND: </label>
                                <label id="cardidmodal"></label>
                                <br>
                                <label for="">Số điện thoại: </label>
                                <label id="phonenumbermodal"></label>
                                <br>
                                <label for="">Email: </label>
                                <label id="emailmodal"></label>
                                <br>
                                <label for="">Chức vụ: </label>
                                <label id="levelmodal"></label>
                                <br>
                                <label for="">Bộ phận: </label>
                                <label id="departmentmodal"></label>
                                <br>
                                <label for="">Bằng cấp: </label>
                                <label id="diplomamodal"></label>
                                <br>
                                <label for="">Lương: </label>
                                <label id="salarymodal"></label>
                                <br>
                                <label for="">Địa chỉ: </label>
                                <label id="addressmodal"></label>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>
<script>
    function idDelete(idDelete) {
        document.getElementById("idemployeeDelete").value = idDelete;
    }

    function nameDelete(nameDelete) {
        document.getElementById("body").innerHTML = "Bạn có muốn xóa " + nameDelete + "?"
    }

    function value(id, name, birthday, cardid, phonenumber,email,level,department,diploma,salary,address) {
        document.getElementById("idmodal").innerHTML = id;
        document.getElementById("namemodal").innerHTML = name;
        document.getElementById("birthdaymodal").innerHTML = birthday;
        document.getElementById("cardidmodal").innerHTML = cardid;
        document.getElementById("phonenumbermodal").innerHTML = phonenumber;
        document.getElementById("emailmodal").innerHTML = email;
        document.getElementById("levelmodal").innerHTML = level;
        document.getElementById("departmentmodal").innerHTML = department;
        document.getElementById("diplomamodal").innerHTML = diploma;
        document.getElementById("salarymodal").innerHTML = salary;
        document.getElementById("addressmodal").innerHTML = address;
    }

    $(document).ready(function () {
        $('#employeeTable').dataTable({
            "dom": 'lrtip',
            'pageLength': 20
        });
    });


</script>
</body>
</html>

