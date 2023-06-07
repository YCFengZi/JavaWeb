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
    <link rel="stylesheet" href="Welcome/musicModel/index.css" />
    <link rel="stylesheet" href="Welcome/musicModel/main.css" />
    <script src="https://kit.fontawesome.com/5841340e1d.js" crossorigin="anonymous"></script>
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
    <script src="https://kit.fontawesome.com/5841340e1d.js" crossorigin="anonymous"></script>
</head>
<body>
    <header>
        <div class="main">
            <ul>
                <li class="active"><a href="#">首页</a></li>
                <li><a href="https://ycfengzi.gitee.io/" target="_blank"><i class="fa-solid fa-blog"></i>  <span style="color: crimson;">B</span>log</a></li>
                <li><a href="https://space.bilibili.com/269517965" target="_blank"><i class="fa-brands fa-bilibili"></i>  <span style="color: crimson;">B</span>ilBil</a></li>
                <li><a href="https://github.com/YCFengZi" target="_blank"><i class="fa-brands fa-github"></i>  <span style="color: crimson;">G</span>ithub</a></li>
            </ul>
        </div>
        <div class="title">
            <a href="/web2203/goods/list.jsp" style="text-decoration: none"><h1><span style="color: crimson;">YC</span> FengZi</h1></a>
        </div>
    </header>

    <%--  音乐模块  --%>
    <div class="music-location">
        <div class="music-box">
            <!-- 上部分 -->
            <article>
                <div class="m-img-box">
                    <div class="m-img-content"></div>
                </div>
                <div class="m-description-content">
                    <article>
                        <p class="m-title">音乐名</p>
                        <p class="m-author">作者</p>
                    </article>
                    <div class="m-btn-box">
                        <button class="m-previous-btn">
                            <svg class="icon" aria-hidden="true" style="transform: scale(-1)">
                                <use href="#icon-xiayishou"></use>
                            </svg>
                        </button>
                        <button class="m-play-btn">
                            <svg class="icon" aria-hidden="true">
                                <use href="#icon-bofang"></use>
                            </svg>
                        </button>
                        <button class="m-next-btn">
                            <svg class="icon" aria-hidden="true">
                                <use href="#icon-xiayishou"></use>
                            </svg>
                        </button>
                    </div>
                </div>
            </article>
            <!-- 下部分 -->
            <section>
                <span class="m-current-time">00 : 00</span>
                <div class="m-progress-bar">
                    <div class="m-progress-main">
                        <span class="m-progress-btn"></span>
                    </div>
                    <div class="m-progress-load"></div>
                </div>
                <span class="m-total-time">00 : 00</span>
            </section>
        </div>
    </div>
    <script src="Welcome/musicModel/iconfont.js"></script>
    <script src="Welcome/musicModel/index.js"></script>
</body>
</html>
