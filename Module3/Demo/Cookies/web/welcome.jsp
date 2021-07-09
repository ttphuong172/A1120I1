<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 7/2/2021
  Time: 9:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
    <script>
        $( function() {
            $("#ngaybatdau").datepicker({ dateFormat: "dd/mm/yy" }).val()
            $("#ngayketthuc").datepicker({ dateFormat: "dd/mm/yy" }).val()
        } );
    </script>

</head>
<body>
<h3>Chào mừng ${username}</h3>
<form action="/welcome" method="post">
    <p>${msg}</p>
    <label for="">ID</label>
    <input type="text" name="id">
    <br>
    <label for="">Dien tich</label>
    <input type="text" name="dientich">
    <br>
    <label for="">Ngay bat dau</label>
    <input type="text" name="ngaybatdau" id="ngaybatdau">
    <br>
    <label for="">Ngay ket thuc</label>
    <input type="text" name="ngayketthuc" id="ngayketthuc">
    <br>
    <label for="">Giá cho thuê</label>
    <input type="text" name="giachothue">
    <br>
    <input type="submit" value="Cal">
</form>
<a href="/logout">Logout</a>
</body>
</html>
