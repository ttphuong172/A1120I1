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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    <script>
        $(document).ready(function (e) {
            var x = true;
            $('button[name="myModal"]').on('click', function(e) {
               
                if(x){
                    e.preventDefault();
                    alert("hello!");
                }
                x = false;
            });
        })
    </script>

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
        <input type="submit" value="TÌM KIẾM" >
    </form>
    </div>
    <c:if test="${empty product}">
    <table class="table">
        <tr>
            <th>Mã SP</th>
            <th>Tên SP</th>
            <th>Giá SP</th>
            <th>Loại SP</th>
            <th>Sửa</th>
            <th>Xóa</th>
        </tr>

        <c:forEach items="${productList}" var="productlist">
            <tr>
                <td id="id">${productlist.id}</td>
                <td id="name">${productlist.name}</td>
                <td>${productlist.price}</td>
                <td>${productlist.productType.productTypeName}</td>
                <td><a href="/?action=update&id=${productlist.id}"><button class="btn btn-warning">EDIT</button></a></td>
                <td><a href="/?action=delete&id=${productlist.id}"><button class="btn btn-danger" onclick="return false">XÓA</button></a></td>

                <td>
                    <a href="/?action=delete&id=${productlist.id}" name="del">  <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal" name="myModal">
                        Open modal
                    </button>
                    </a>

                    <!-- The Modal -->
                    <div class="modal" id="myModal">
                        <div class="modal-dialog">
                            <div class="modal-content">

                                <!-- Modal Header -->
                                <div class="modal-header">
                                    <h4 class="modal-title">Modal Heading</h4>
                                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                                </div>

                                <!-- Modal body -->
                                <div class="modal-body">
                                    Modal body..
                                </div>

                                <!-- Modal footer -->
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-danger" data-dismiss="modal" id="ok">OK</button>
                                    <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
                                </div>

                            </div>
                        </div>
                    </div>
                </td>

            </tr>
        </c:forEach>
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
                    <td><a id="delete" href="/?action=update&id=${product.id}"><button class="btn btn-warning">EDIT</button></a></td>
                    <td><a href="/?action=delete&id=${product.id}"><button class="btn btn-danger">XÓA</button></a></td>
                </tr>

        </table>
    </c:if>
</div>


</body>
</html>
