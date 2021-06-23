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
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="../css/main.css">
    <script>
        $(document).ready(function () {
            var selectVal = $("#servicetypeid option:selected").val();
            if (selectVal == 'RO') {
                $('#villa').prop('disabled', true);
                $('#room').prop('disabled', false);
            } else if (selectVal == 'VL') {
                $('#villa').prop('disabled', false);
                $('#room').prop('disabled', true);
            } else if (selectVal == 'HO') {
                $('#villa').prop('disabled', false);
                $('#room').prop('disabled', true);
                $('#pollarea').prop('disabled', true);
            }

            $("#servicetypeid").on('change', function () {
                var loadVal = $("#servicetypeid option:selected").val();
                if (loadVal == 'RO') {
                    $('#villa').prop('disabled', true);
                    $('#room').prop('disabled', false);
                } else if (loadVal == 'VL') {
                    $('#villa').prop('disabled', false);
                    $('#room').prop('disabled', true);
                } else if (loadVal == 'HO') {
                    $('#villa').prop('disabled', false);
                    $('#room').prop('disabled', true);
                    $('#pollarea').prop('disabled', true);
                }
            })
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
            <h3>Thêm mới dịch vụ</h3>
            <form action="/service?action=create" method="post">
                <div>
                    <fieldset class="scheduler-border">
                        <legend class="scheduler-border">Thông tin chung</legend>
                        <table class="table">
                            <tr>
                                <td width="15%"><label for="">Mã dịch vụ</label></td>
                                <td width="30%"><input type="text" name="serviceid" class="form-control"></td>
                                <td width="15%"><label for="">Loại dịch vụ</label></td>
                                <td width="30%">
                                    <select name="servicetypeid" class="custom-select" id="servicetypeid">
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
                    <fieldset class="scheduler-border" id="villa">
                        <legend class="scheduler-border">Villa</legend>
                        <table class="table">
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
                                <td><input type="number" name="pollvillaarea" class="form-control" id="pollarea"></td>
                                <td><label for="">Số tầng</label></td>
                                <td><input type="number" name="numberfloorvillahouse" class="form-control"></td>
                            </tr>
                        </table>
                    </fieldset>

                    <fieldset class="scheduler-border" id="room">
                        <legend class="scheduler-border">Room</legend>
                        <table class="table">
                            <tr>
                                <td width="15%"><label for="">Dịch vụ miễn phí</label></td>
                                <td width="30%"><input type="text" name="freeserviceroom" class="form-control"></td>
                                <td width="15%"></td>
                                <td width="30%"></td>
                            </tr>
                        </table>
                    </fieldset>
                </div>
                <td><a href="/"><button class="btn btn-primary">Thêm mới</button></a></td>
            </form>
        </div>
    </div>

    <div id="footer" style="width: 100%;height: 50px;background-color: darkgray;color: white">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>
</body>
</html>
