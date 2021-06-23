<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/10/2021
  Time: 11:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>List Product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.25/css/dataTables.bootstrap4.min.css">
    <script src=" https://code.jquery.com/jquery-3.5.1.js"></script>
    <script src="https://cdn.datatables.net/1.10.25/js/jquery.dataTables.min.js"></script>
    <script src="https://cdn.datatables.net/1.10.25/js/dataTables.bootstrap4.min.js"></script>

    <script>
        $(document).ready(function () {
            $('#producttable').DataTable();
        });

        function detail(id, name, price, typename) {

            document.getElementById("idmodal").innerHTML = id;
            document.getElementById("namemodal").innerHTML = name;
            document.getElementById("pricemodal").innerHTML = price;
            document.getElementById("typenamemodal").innerHTML = typename;
        }
    </script>
    <style>
        .modal-body{
            display: flex;
            justify-content: space-evenly;
        }
    </style>
</head>
<body>

<div class="container">
    <h3>DANH SÁCH SẢN PHẨM</h3>
    <a href="/?action=create">
        <button class="btn btn-primary">THÊM MỚI</button>
    </a>
    <div>
        <p>Tìm kiếm sản phẩm</p>
        <form action="/?action=find" method="post">
            <input type="text" name="find" id="find">
            <input type="submit" value="TÌM KIẾM">
        </form>
    </div>
    <c:if test="${empty product}">
        <table class="table" id="producttable">
            <thead>
            <tr>
                <th>Mã SP</th>
                <th>Tên SP</th>
                <th>Giá SP</th>
                <th>Loại SP</th>
                <th>Chi tiết</th>
                <th>Sửa</th>
                <th>Xóa</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${productList}" var="productlist">
                <tr>
                    <td id="id">${productlist.id}</td>
                    <td id="name">${productlist.name}</td>
                    <td>${productlist.price}</td>
                    <td>${productlist.productType.productTypeName}</td>
                    <td><a class="btn btn-primary" href="" role="button" data-toggle="modal" data-target="#modelDetail"
                           onclick="detail('${productlist.id}','${productlist.name}','${productlist.price}','${productlist.productType.productTypeName}')">Chi
                        tiết</a></td>
                    <td><a href="/?action=update&id=${productlist.id}">
                        <button class="btn btn-warning">EDIT</button>
                    </a></td>
                    <td><a href="/?action=delete&id=${productlist.id}">
                        <button class="btn btn-danger" onclick="return false">XÓA</button>
                    </a></td>
                </tr>
            </c:forEach>
            <!-- Button trigger modal -->
            <button type="button" class="btn btn-primary btn-lg">
                Launch
            </button>

            <!-- Modal -->
            <div class="modal fade" id="modelDetail" tabindex="-1" role="dialog" aria-labelledby="modelTitleId"
                 aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Product Detail</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="info">
                                <label for="">Mã SP:</label>
                                <span id="idmodal"></span>
                                <br>
                                <label for="">Tên SP:</label>
                                <span id="namemodal"></span>
                                <br>
                                <label for="">Giá SP:</label>
                                <span id="pricemodal"></span>
                                <br>
                                <label for="">Loại SP:</label>
                                <span id="typenamemodal"></span>
                            </div>
                            <div class="img">
                                <img src="https://i0.wp.com/s1.uphinh.org/2021/06/20/omo.jpg" alt="" style="width: 100px;height: 100px">
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            </tbody>
        </table>
    </c:if>

    <c:if test="${not empty product}">
        <table class="table">
            <tr>
                <th>Mã SP</th>
                <th>Tên SP</th>
                <th>Giá SP</th>
                <th>LoạiSP</th>
                <th>Sửa</th>
                <th>Xóa</th>
            </tr>


            <tr>
                <td>${product.id}</td>
                <td>${product.name}</td>
                <td>${product.price}</td>
                <td>${product.productType.productTypeName}</td>
                <td><a id="delete" href="/?action=update&id=${product.id}">
                    <button class="btn btn-warning">EDIT</button>
                </a></td>
                <td><a href="/?action=delete&id=${product.id}">
                    <button class="btn btn-danger">XÓA</button>
                </a></td>
            </tr>

        </table>
    </c:if>
</div>
</body>
</html>
