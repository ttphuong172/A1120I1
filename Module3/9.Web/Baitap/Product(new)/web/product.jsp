<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/2/2021
  Time: 7:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        label{
            display: inline-block;
            width: 200px;
        }
    </style>
</head>
<body>
<div class="container">
<h3>Product Discount Calculator</h3>
<form action="/display-discount" method="post">
    <label for="">Product Description</label>
    <input type="text" class="form-control" name="description">
    <label for="">List Price</label>
    <input type="text" class="form-control" name="price">
    <label for="">Discount Percent</label>
    <input type="text" class="form-control" name="percent">

    <input type="submit" class="btn btn-primary" value="Calculate Discount">
</form>
</div>
</body>
</html>
