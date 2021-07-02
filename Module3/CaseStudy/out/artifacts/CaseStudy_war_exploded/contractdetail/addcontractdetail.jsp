<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/7/2021
  Time: 9:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Edit Contract Detail</title>
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
        <div class="sidebar col-sm-2">
            sidebar
        </div>
        <div class="bodyarea col-sm-10">
            <h3>Thêm mới dịch vụ cộng thêm</h3>
            <form action="/contractdetail?action=create" method="post" class="form-group">
                <table class="table">
                    <tr>
                        <td></td>
                        <td></td>
                        <td><label for="">Dich vụ</label></td>
                        <td>
                            <select name="attachserviceid" id="">
                                <c:forEach items="${attachService}" var="attachservice">
                                    <option value="${attachservice.attachServiceId}">
                                            ${attachservice.attachServiceName}
                                    </option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="">Hợp đồng</label></td>
                        <td><select name="contractid" id="">
                            <c:forEach items="${contract}" var="contract">
                                <option value="${contract.contractId}">
                                        ${contract.customer.customerName}
                                </option>
                            </c:forEach>
                        </select>
                        </td>
                        <td><label for="">Số lượng</label></td>
                        <td><input type="text" name="quantity"></td>
                    </tr>

                    <tr>
                        <td></td>
                        <td> <input class="btn btn-primary" type="submit" value="Thêm mới"></td>
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
