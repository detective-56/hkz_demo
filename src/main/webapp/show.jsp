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
        .yzgx{width: 1200px; margin: 12px auto 6px; z-index:-1;}
        .jtxqj1{background:#f1f1f1;font-size:16px;margin-top: 20px;margin-left:5px; margin-bottom:20px;padding-left:5px;float:left;width:99.5%;color:red;}
        .jtxqj{background:#f1f1f1;font-size:16px;margin-top:5px;margin-left:5px;margin-bottom:15px;padding-left:5px;float:left;width:99.5%;color:red;}
        .xqj{clear: both;text-align:center}
        .xqj li{margin:15px 12px -5px 10px;float:left;}
        .xqj li a{font-size:14px;color:#999;}
        .footboot {width:100%;padding-top:13px;height:100px;}
    </style>

</head>
<body>
<script>
    function setTab(name,cursel,n){
        for(i=1;i<=n;i++){
            var menu=document.getElementById(name+i);
            var con=document.getElementById("con_"+name+"_"+i);
            //menu.className=i==cursel?"current":"";
            con.style.display=i==cursel?"block":"none";
        }
    }</script>
<header>
    <div class="nav">
        <a href="index.jsp">首页</a>
        <a href="show.jsp">番表</a>
        <div class="header-right">
            <form class="" action="/Search" method="post" >
                <input class="se" type="text" placeholder="输入关键字" name="search_info">
                <input class="ico-img" type="submit" value>
                <!-- <input type="submit" class="ico-img2"> -->
            </form>
            <div><a href= "#"><img class = "head-photo" src ="./imge/4.jpeg" alt = "4"></img></a></div>
        </div>
    </div>
</header>
<div class="wrap yzgx">
    <div class="xqj">
         <span class="jtxqj1">
            <a onclick="setTab('dm',1,7);" href="/List_info?week=1">周一</a>&nbsp;&nbsp;
            <a onclick="setTab('dm',2,7);" href="/List_info?week=2">周二</a>&nbsp;&nbsp;
            <a onclick="setTab('dm',3,7);" href="/List_info?week=3">周三</a>&nbsp;&nbsp;
            <a onclick="setTab('dm',4,7);" href="/List_info?week=4">周四</a>&nbsp;&nbsp;
            <a onclick="setTab('dm',5,7);" href="/List_info?week=5">周五</a>&nbsp;&nbsp;
            <a onclick="setTab('dm',6,7);" href="/List_info?week=6">周六</a>&nbsp;&nbsp;
            <a onclick="setTab('dm',7,7);" href="/List_info?week=7">周日</a>&nbsp;&nbsp;
        </span>
    </div>

    <div class="xqj" id="con_dm_1" style="display:block ">
        <c:forEach items = "${b_infolist}" var = "info">
            <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" title="${info.name}">
                <span class="jtxqj">${info.name}(最新:${info.last_num}集)</span>
            </a>
        </c:forEach>
    </div>
    <div class="xqj" id="con_dm_2" style="display: none;">
        <c:forEach items = "${b_infolist}" var = "info">
            <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" title="${info.name}">
                <span class="jtxqj">${info.name}(最新:${info.last_num}集)</span>
            </a>
        </c:forEach>
    </div>
    <div class="xqj" id="con_dm_3" style="display: none;">
        <c:forEach items = "${b_infolist}" var = "info">
            <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" title="${info.name}">
                <span class="jtxqj">${info.name}(最新:${info.last_num}集)</span>
            </a>
        </c:forEach>
    </div>
    <div class="xqj" id="con_dm_4" style="display: none;">
        <c:forEach items = "${b_infolist}" var = "info">
            <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" title="${info.name}">
                <span class="jtxqj">${info.name}(最新:${info.last_num}集)</span>
            </a>
        </c:forEach>
    </div>

    <div class="xqj" id="con_dm_5" style="display: none;">
        <c:forEach items = "${b_infolist}" var = "info">
            <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" title="${info.name}">
                <span class="jtxqj">${info.name}(最新:${info.last_num}集)</span>
            </a>
        </c:forEach>
    </div>

    <div class="xqj" id="con_dm_6" style="display: none;">
        <c:forEach items = "${b_infolist}" var = "info">
            <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" title="${info.name}">
                <span class="jtxqj">${info.name}(最新:${info.last_num}集)</span>
            </a>
        </c:forEach>
    </div>

    <div class="xqj" id="con_dm_7" style="display: none;">
        <c:forEach items = "${b_infolist}" var = "info">
            <a href="/Specific?name=${info.name}&&num=${info.last_num}&&prenum=1" title="${info.name}">
                <span class="jtxqj">${info.name}(最新:${info.last_num}集)</span>
            </a>
        </c:forEach>
    </div>
</div>
</body>
</html>
