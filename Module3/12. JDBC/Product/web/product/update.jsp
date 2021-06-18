<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/10/2021
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Update Product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        label {
            display: inline-block;
            width: 150px;
        }
    </style>
</head>
<body>
<div class="container">
    <h3>CẬP NHẬT THÔNG TIN</h3>
    <form method="post" class="form-group">
        <label for="">Mã SP</label>
        <input type="text" readonly="readonly" name="id" value="${product.id}">
        <br>
        <label for="">Tên SP</label>
        <input type="text" name="name" value="${product.name}">
        <br>
        <label for="">Giá SP</label>
        <input type="text" name="price" value="${product.price}">
        <br>
        <label>Loại sản phẩm</label>

        <select name="type" id="type">
<%--            <option value="${product.productType.productTypeId}">${product.productType.productTypeName}</option>--%>
            <c:forEach items="${productTypeList}" var="producttypelist">
                <option value="${producttypelist.productTypeId}"
                        <c:if test="${producttypelist.productTypeId==product.productType.productTypeId}">
                          selected
                        </c:if>
                >${producttypelist.productTypeName}
                </option>

            </c:forEach>
        </select>

        <br>
        <label for=""></label>
        <input type="submit" value="Cập nhật" class="btn btn-primary">

    </form>
</div>
</body>
</html>
