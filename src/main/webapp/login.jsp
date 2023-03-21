<%@ page language="java" import="java.util.*" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath%>">
    <meta charset="UTF-8" />

    <title>Document</title>
    <link rel="stylesheet" href="<c:url value='css/style.css'></c:url>" />
    <style>

    </style>

</head>
    <body>
        <form class="box" action="Login" method="post">
            <h1>login</h1>
            <input type="text" name="Username" placeholder="Username">
            <input type="password" name="Password" placeholder="Password">
            <input type="submit" name="" value="Login">
        </form>
    </body>
</html>