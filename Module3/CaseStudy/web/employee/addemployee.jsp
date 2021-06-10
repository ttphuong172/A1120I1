<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 6/8/2021
  Time: 12:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Employee</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">
    <link rel="stylesheet" href="../css/main.css">
</head>
<body>
<div class="container pt-5">
    <div id="header" class="row">
        <div class="logo col-sm-10">
            <img src="../img/logo.jpg" alt="logo">
        </div>
        <div class="name col-sm-2">
            <h3>name</h3>
        </div>
    </div>
    <div id="nav" class="row">
        <div class="menu col-sm-8">
            <ul>
                <a href="">
                    <li>Home</li>
                </a>
                <a href="">
                    <li>Employee</li>
                </a>
                <a href="">
                    <li>Customer</li>
                </a>
                <a href="">
                    <li>Service</li>
                </a>
                <a href="">
                    <li>Contract</li>
                </a>
            </ul>
        </div>
        <div class="input_icon col-sm-4">
            <input type="text" id="search" placeholder="search">
            <i class="icon fas fa-search"></i>
        </div>
    </div>

    <div id="main" class="row">
        <div class="sidebar col-sm-2" style="height: 500px;">
            sidebar
        </div>
        <div class="bodyarea col-sm-10" style="height: 500px;">
            <h3>Thêm mới nhân viên</h3>
            <form action="" method="post" class="form-group">
                <table class="table">
                    <tr>
                        <td><label for="">Họ tên nhân viên</label></td>
                        <td><input type="text" name="nameemployee"  class="form-control" ></td>
                    </tr>
                    <tr>
                        <td><label for="">Ngày sinh</label></td>
                        <td><input type="text" name="nameemployee"  class="form-control" ></td>
                    </tr>
                    <tr>
                        <td><label for="">Số CMND</label></td>
                        <td><input type="text" name="nameemployee"  class="form-control" ></td>
                    </tr>
                    <tr>
                        <td><label for="">Số điện thoại</label></td>
                        <td><input type="text" name="nameemployee"  class="form-control" ></td>
                    </tr>
                    <tr>
                        <td><label for="">Email</label></td>
                        <td><input type="text" name="nameemployee"  class="form-control" ></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

    <div id="footer">
        <p>&copy; Codegym Da Nang</p>
    </div>
</div>

</body>
</html>
