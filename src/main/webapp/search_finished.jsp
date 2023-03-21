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
    <link rel="stylesheet" href="<c:url value='css/1.css'></c:url>" />
    <style>

    </style>

</head>
<body>
<header>
    <div class="nav">
        <a href="index.jsp">首页</a>
        <a href="#">番表</a>
        <div class="header-right">
            <form class="" action="/Search" method="post" >
                <input class="se" type="text" placeholder="输入关键字" name="search_info">
                <input class="ico-img" type="submit" value>
                <!-- <input type="submit" class="ico-img2"> -->
            </form>
            <div><a href= "#"><img class = "head-photo" src ="imge/4.jpeg" alt = "4" /></a></div>
        </div>
    </div>
</header>
<section>
    <div class="wrap">
        <div class="left">
            <div class="h1 clearfix">
                <a href="#"><span>动漫</span></a>
            </div>
            <ul>
                <c:forEach items = "${search_infolist}" var = "info">
                    <li>
                        <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" class="li-hv" title="${info.name}">
                            <div class="img">
                                <img class="lazy" src="${info.img}" data-original="${info.img}" alt="${info.name}" style="display:block">
                                <b class="bg1"></b>
                                <b class="play-hv"></b>
                                <b class="sjbg"></b>
                                <p class="bz">最新:${info.last_num}集</p>
                            </div>
                            <div class="text">
                                <p class="name">${info.name}</p>
                            </div>
                        </a>
                    </li>
                </c:forEach>

            </ul>
        </div>
    </div>
</section>

</body>
</html>