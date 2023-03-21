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
    <title>Title</title>
    <style>
        * {
            margin: 0px;
            padding: 0px;
            box-sizing: border-box;
        }
        .wrap {
            margin: 0 auto;
            width: 1200px;
            padding-top: 10px;
        }

        .h2 {
            height: 40px;
            line-height: 40px;
            overflow: hidden;
            margin-bottom: 15px;
            font-size: 120%;
            color: #000;
            border-bottom: 2px solid #e5e5e5;
        }


        .player {
            background: url(./imge/loading.gif) no-repeat center center;
            height: 490px;
        }


        a {
            text-decoration: none;
        }

        li {
            list-style: none;
        }

        ul {
            display: block;
            list-style-type: disc;
            margin-block-start: 1em;
            margin-block-end: 1em;
            margin-inline-start: 0px;
            margin-inline-end: 0px;
        }

        .numlist li {
            float: left;
            text-align: center;
        }

        .numlist li a {
            display: block;
            width: 108px;
            height: 32px;
            line-height: 32px;
            border: 1px solid #dfdfdf;
            color: #0785d4;
            overflow: hidden;
        }


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
                <div><a href= "#"><img class = "head-photo" src ="./imge/4.jpeg" alt = "4"></img></a></div>
            </div>
        </div>
    </header>
    <div class="wrap">
        <div class="h2">
            <a href="index.jsp">首页</a>
            “&nbsp;>>&nbsp;”
            <a href="#">${info_name}</a>
        </div>
        <div class="player" style="background-color:#000">
            <video width="1200px" height="490px" controls>
                <source src="${info_url}" type="video/mp4">
            </video>
        </div>
        <div>
            <h3>播放列表</h3>
        </div>
        <ul class="numlist" style="display: block;">
            <li><a href="/Specific?name=${info_name}&&num=${info_num}&&prenum=OP" class=‘twidth’>OP</a></li>
            <script type="text/javascript">
                var size = ${info_num};
                for (var i = 1; i <= size; i += 1){
                    document.write("<li><a href=/Specific?name=${info_name}&&num=${info_num}&&prenum="+i+" class=‘twidth’>"+i+"</a></li>")
                }
            </script>
            <li><a href="/Specific?name=${info_name}&&num=${info_num}&&prenum=ED" class=‘twidth’>ED</a></li>
<%--            <li><a href="#" class="twidth">i</a></li>--%>
        </ul>
    </div>

    </body>
</html>