<%--
  Created by IntelliJ IDEA.
  User: FengZi
  Date: 2023/5/25
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎你的到来</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link rel="stylesheet" type="text/css" href="css/style.css" /> -->
    <style>
        *{
            padding: 0;
            margin: 0;
            font-family: "楷体";
        }
        header{
            background-image:linear-gradient(rgba(0,0,0,0.5),rgba(0,0,0,0.5)), url(https://cdn.staticaly.com/gh/YCFengZi/PicX-figure-bed@main/Pixivel/Hexo图床/页面布局/主页面.png);
            height: 100vh;
            background-size: cover;
            background-position: center;
        }

        ul{
            float: right;
            list-style-type: none;
            margin: 15px;
        }
        ul li{
            display: inline-block;
        }

        ul li a{
            text-decoration: none;
            color: #fff;
            padding: 5px 20px;
            border: 1px solid transparent;
            transition: .6s ease;
            border-radius: 20px;
        }

        ul li a:hover{
            background-color: #fff;
            color: #000;
        }
        ul li.active a{
            background-color: #fff;
            color: #000;
        }
        .title{
            position: absolute;
            top:50%;
            left:50%;
            transform: translate(-50%,-50%);
        }
        .title h1{
            color: #fff;
            font-size: 70px;
            font-family: Century Gothic;
        }
    </style>
</head>
<body>
    <header>
        <div class="main">
            <ul>
                <li class="active"><a href="#">首页</a></li>
                <li><a href="https://ycfengzi.gitee.io/" target="_blank"><span style="color: crimson;">B</span>log</a></li>
                <li><a href="https://space.bilibili.com/269517965" target="_blank"><span style="color: crimson;">B</span>ilBil</a></li>
                <li><a href="https://github.com/YCFengZi" target="_blank"><span style="color: crimson;">G</span>ithub</a></li>
            </ul>
        </div>
        <div class="title">
            <h1><span style="color: crimson;">YC</span> FengZi</h1>
        </div>
    </header>
</body>
</html>
