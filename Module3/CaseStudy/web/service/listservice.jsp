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
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet" href="/datatables/css/dataTables.bootstrap4.css">
    <link rel="stylesheet" href="/css/main.css">

    <script src="/js/jquery-3.5.1.min.js"></script>
    <script src="/js/bootstrap.js"></script>
    <script src="/datatables/js/jquery.dataTables.js"></script>
    <script src="/datatables/js/dataTables.bootstrap4.js"></script>

    <script>
        $(document).ready(function () {
            $('#servicetable').dataTable({
                "dom": 'lrtip',
                'pageLength': 10
            });
        })
    </script>
</head>
<body>
<div class="container-fluid">
    <jsp:include page="../header.jsp"/>
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
                <form action="/service?action=find" method="post">
                    <input type="text" name="find">
                    <input type="submit" value="TÌM KIẾM">
                </form>
                <table class="table table-striped table-bordered" id="servicetable">
                    <thead>
                    <tr>
                        <th>Mã DV</th>
                        <th>Mã Loại DV</th>
                        <th>Tên DV</th>
                        <th>Diện tích</th>
                        <th>Giá thuê</th>
                        <%--                        <th>Số người</th>--%>
                        <th>Hình thức thuê</th>
                        <%--                        <th>Tiêu chuẩn</th>--%>
                        <%--                        <th>Tiện ích khác</th>--%>
                        <%--                        <th>Diện tích hồ bơi</th>--%>
                        <th>Số tầng</th>
                        <%--                        <th>Dịch vụ miễn phí</th>--%>
                        <th>Chi tiết</th>
                        <th>Sửa</th>
                        <th>Xóa</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${serviceList}" var="servicelist">
                        <tr>
                            <td>${servicelist.serviceId}</td>
                            <td>${servicelist.serviceType.serviceTypeName}</td>
                            <td>${servicelist.serviceName}</td>
                            <td>${servicelist.useArea}</td>
                            <td>${servicelist.rentalPrice}</td>
                                <%--                            <td>${servicelist.maxPerson}</td>--%>
                            <td>${servicelist.rentalForm.rentalFormName}</td>
                                <%--                            <td>${servicelist.villaHouseStandard.villaHouseStandardName}</td>--%>
                                <%--                            <td>${servicelist.otherConvenientVillaHouse}</td>--%>
                                <%--                            <td>--%>
                                <%--                                <c:if test="${servicelist.pollVillaArea==0}">-</c:if>--%>
                                <%--                                <c:if test="${servicelist.pollVillaArea!=0}">--%>
                                <%--                                    ${servicelist.pollVillaArea}--%>
                                <%--                                </c:if>--%>
                                <%--                            </td>--%>


                            <td>
                                <c:if test="${servicelist.numberFloorVillaHouse==0}">-</c:if>
                                <c:if test="${servicelist.numberFloorVillaHouse!=0}">
                                    ${servicelist.numberFloorVillaHouse}
                                </c:if>
                            </td>

                                <%--                            <td>--%>
                                <%--                                <c:if test="${servicelist.freeServiceRoom==null}">-</c:if>--%>
                                <%--                                <c:if test="${servicelist.freeServiceRoom!=null}">--%>
                                <%--                                    ${servicelist.freeServiceRoom}--%>
                                <%--                                </c:if>--%>
                                <%--                            </td>--%>
                            <td>
                                <!-- Button trigger modal -->
                                <button type="button" class="btn btn-primary" data-toggle="modal"
                                        data-target="#modelDetail"
                                        onclick="Value('${servicelist.serviceId}','${servicelist.serviceType.serviceTypeName}',
                                                '${servicelist.serviceName}','${servicelist.useArea}','${servicelist.rentalPrice}',
                                                '${servicelist.maxPerson}','${servicelist.rentalForm.rentalFormName}',
                                                '${servicelist.villaHouseStandard.villaHouseStandardName}',
                                                '${servicelist.otherConvenientVillaHouse}',' ${servicelist.pollVillaArea}',
                                                ' ${servicelist.numberFloorVillaHouse}','  ${servicelist.freeServiceRoom}')">
                                    Detail
                                </button>

                            </td>
                            <!-- Modal -->
                            <div class="modal fade" id="modelDetail" tabindex="-1" role="dialog"
                                 aria-labelledby="modelTitleId" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title">Thông tin chi tiết dịch vụ</h5>
                                            <button type="button" class="close" data-dismiss="modal"
                                                    aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <div class="modal-body" style="display: flex; justify-content: space-between">
                                            <div class="infor">
                                                <label for="">Mã DV:</label>
                                                <span id="idmodal"></span>
                                                <br>
                                                <label for="">Tên loại DV:</label>
                                                <span id="nametypemodal"></span>
                                                <br>
                                                <label for="">Tên DV:</label>
                                                <span id="namemodal"></span>
                                                <br>
                                                <label for="">Diện tích:</label>
                                                <span id="areamodal"></span>
                                                <br>
                                                <label for="">Giá thuê:</label>
                                                <span id="pricemodal"></span>
                                                <br>
                                                <label for="">Số người tối đa:</label>
                                                <span id="maxpersonmodal"></span>
                                                <br>
                                                <label for="">Số người tối đa:</label>
                                                <span id="retalformmodal"></span>
                                                <br>
                                                <label for="">Tiêu chuẩn:</label>
                                                <span id="villahousestandardmodal"></span>
                                                <br>
                                                <label for="">Tiện ích khác:</label>
                                                <span id="otherconvenientvillahousemodal"></span>
                                                <br>
                                                <label for="">Diện tích hồ bơi:</label>
                                                <span id="poolareavillamodal"></span>
                                                <br>
                                                <label for="">Số tầng:</label>
                                                <span id="numberfloormodal"></span>
                                                <br>
                                                <label for="">Dịch vụ miễn phí:</label>
                                                <span id="freeServicemodal"></span>
                                            </div>
                                            <div class="image">
                                                <img src="https://i0.wp.com/s1.uphinh.org/2021/06/22/villa.jpg" alt=""
                                                     width="200px" height="200px">
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">
                                                Close
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <td>
                                <a href="/service?action=edit&id=${servicelist.serviceId}">
                                    <button class="btn btn-warning">Sửa</button>
                                </a>
                            </td>
                            <td>

                                <a class="btn btn-danger" href="#" role="button" data-toggle="modal"
                                   data-target="#modelDelete"
                                   onclick="idDelete('${servicelist.serviceId}');nameDelete('${servicelist.serviceName}')">Delete</a>
                            </td>


                            <!-- Modal -->
                            <div class="modal fade" id="modelDelete" tabindex="-1" role="dialog"
                                 aria-labelledby="modelTitleId" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                    <div class="modal-content">
                                        <div class="modal-header">
                                            <h5 class="modal-title">Xác nhận xóa</h5>
                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                <span aria-hidden="true">&times;</span>
                                            </button>
                                        </div>
                                        <form action="">
                                            <input type="hidden" name="action" value="delete">
                                            <input type="hidden" name="id" value="" id="idServiceDelete">
                                            <div class="modal-body">
                                                <p id="body"></p>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-primary" data-dismiss="modal">
                                                    Cancel
                                                </button>
                                                <button type="submit" class="btn btn-danger">Delete</button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>
<script>
    function Value(id, nametypemodal, namemodal, area, price, maxperson, rentalform, villahousestandard, otherconvenientvillahouse, pollvillaarea, numberfloor, freeservice) {
        document.getElementById("idmodal").innerHTML = id;
        document.getElementById("nametypemodal").innerHTML = namemodal;
        document.getElementById("namemodal").innerHTML = nametypemodal;
        document.getElementById("areamodal").innerHTML = area;
        document.getElementById("pricemodal").innerHTML = price;
        document.getElementById("maxpersonmodal").innerHTML = maxperson;
        document.getElementById("retalformmodal").innerHTML = rentalform;
        document.getElementById("villahousestandardmodal").innerHTML = villahousestandard;
        document.getElementById("otherconvenientvillahousemodal").innerHTML = otherconvenientvillahouse;
        document.getElementById("poolareavillamodal").innerHTML = pollvillaarea;
        document.getElementById("numberfloormodal").innerHTML = numberfloor;
        document.getElementById("freeServicemodal").innerHTML = freeservice;
    }

    function idDelete(idDelete) {
        document.getElementById("idServiceDelete").value = idDelete;
    }

    function nameDelete(nameDelete) {
        document.getElementById("body").innerHTML = "Bạn có muốn xóa " + nameDelete + "?"
    }
</script>
</body>
</html>
