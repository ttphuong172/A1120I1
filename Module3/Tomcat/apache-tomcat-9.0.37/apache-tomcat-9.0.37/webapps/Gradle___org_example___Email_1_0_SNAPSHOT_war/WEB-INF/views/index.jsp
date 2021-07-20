
<%--
  Created by IntelliJ IDEA.
  User: phuongtt
  Date: 20/07/2021
  Time: 1:52 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h3>Setting</h3>
  <form:form action="" method="" modelAttribute="emailSetting">
  <label for="">Languages: </label>
  <form:select path="languages" items="languageList"/>
  </form:form>
  </body>
</html>
