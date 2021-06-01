<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/1/2021
  Time: 9:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <style>
      label{
        display: inline-block;
        width: 200px;
      }
    </style>
  </head>
  <body>
<form action="/calculate" method="post">
  <h1>Product Discount Calculator</h1>
  <label for="">Product Description</label>
  <input type="text" name="productdescription">
  <br>
  <br>
  <label for="">List Price</label>
  <input type="text" name="listprice">
  <br>
  <br>
  <label for="">Discount Percent</label>
  <input type="text" name="discountpercent">
  <br>
  <br>
  <label></label>
  <input type="submit" id="submit" value="Calculator Discount">
</form>
  </body>
</html>
