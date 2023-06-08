<%--
  Created by IntelliJ IDEA.
  User: FengZi
  Date: 2023/6/3
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>商品详情</title>
    <link rel="icon" href="/web2203/goods/image/logo.ico" type="image/x-icon">
    <link rel="stylesheet" href="/web2203/goods/css/main.css">
    <link rel="stylesheet" href="/web2203/goods/css/font_header.css">
    <link rel="stylesheet" href="/web2203/goods/css/font_leftBox.css">
    <link rel="stylesheet" href="/web2203/goods/css/font_footer.css">
</head>
<body>
    <div class="container">
        <!-- 头部 -->
        <div class="header">
            <div class="logo">
                <img src="/web2203/goods/image/logo.png" alt="">
                <span>Bad Music</span>
            </div>

            <div class="middle">
                <i class="iconfont icon-jiantou-xiangzuo"></i>
                <i class="iconfont icon-jiantou-xiangyou"></i>
                <div class="search">
                    <i class="iconfont icon-sousuo"></i>
                    <input type="text" placeholder="搜索">
                </div>
                <i class="iconfont icon-mic-on"></i>
            </div>


            <div class="other">
                <div class="userInfo">
                    <img src="/web2203/goods/image/YCFengZi.jpg" alt="author">
                    <span>${user}</span>
                </div>
                <ul>
                    <li><i class="iconfont icon-zhuti"></i></li>
                    <li><i class="iconfont icon-shezhi"></i></li>
                    <li><i class="iconfont icon-xinfeng"></i></li>
                    <li class="vertical_bar"></li>
                    <li><i class="iconfont icon-MINIMIZE"></i></li>
                    <li><i class="iconfont icon-zuixiaohua"></i></li>
                    <li><i class="iconfont icon-zuidahua"></i></li>
                    <li><i class="iconfont icon-guanbi"></i></li>
                </ul>
            </div>
        </div>

        <!-- 渐变线条 -->
        <div class="line"></div>

        <!-- 中间 -->
        <div class="main">
            <div class="left-box">
                <ul>
                    <li><span>发现音乐</span></li>
                    <li><span>播客</span></li>
                    <li><span>视频</span></li>
                    <li><span>关注</span></li>
                    <li><span>直播</span></li>
                    <li><span>私人FM</span></li>
                </ul>
                <div class="my_music">
                    <span>我的音乐</span>
                </div>
                <ul class="mine">
                    <li><i class="iconfont icon-bendixiazai"></i><span>本地与下载</span></li>
                    <li><i class="iconfont icon-zuijinbofang"></i><span>最近播放</span></li>
                    <li><i class="iconfont icon-yun"></i><span>我的音乐云盘</span></li>
                    <li><i class="iconfont icon-boke1"></i><span>我的播客</span></li>
                    <li><i class="iconfont icon-ego-favorite"></i><span>我的收藏</span></li>
                </ul>
                <div class="create_list">
                            <span>
                                创建的歌单
                                <i class="iconfont icon-ico_arrowright"></i>
                                <i class="iconfont icon-jia i_last"></i>
                            </span>
                </div>
                <div class="create_list">
                            <span>
                                收藏的歌单
                                <i class="iconfont icon-ico_arrowright"></i>
                            </span>
                </div>
            </div>
            <div class="right-box">
                <ul class="navigation">
                    <li class="active"><span>个性推荐</span></li>
                    <li><span>专属定制</span></li>
                    <li><span>歌单</span></li>
                    <li><span>排行榜</span></li>
                    <li><span>歌手</span></li>
                    <li><span>最新音乐</span></li>
                </ul>
                <div class="banner">
                    <div class="infomation">
                        <h2><span style="color: aquamarine;">${good.id}</span>.${good.name}</h2>
                        <p>${good.information}</p>
                        <div class="btn_listen btn_listen_1">
                            <span>点击购买(${good.price})</span>
                        </div>
                        <div class="btn_listen btn_listen_2">
                            <span>点击收藏</span>
                        </div>
                    </div>
                    <img src="/web2203/goods/image/世凪.png" alt="">
                </div>

                <%-- JS做轮播图（多商品） --%>
                <div class="dot">
                    <ul class="dots">
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                        <li></li>
                    </ul>
                </div>

                <div class="recm_list">
                    <div class="recm_word">音乐馆<i class="iconfont icon-jiantou-xiangyou"></i></div>
                    <ul>
                        <li>
                            <img src="/web2203/goods/image/main/周杰伦.jpg" alt="">
                            <span>晴天<br>周杰伦</span>
                        </li>
                        <li>
                            <img src="/web2203/goods/image/main/陈奕迅.jpg" alt="">
                            <span>葡萄成熟时<br>陈奕迅</span>
                        </li>
                        <li>
                            <img src="/web2203/goods/image/main/林俊杰.jpg" alt="">
                            <span>黑夜问白天<br>林俊杰</span>
                        </li>
                        <li>
                            <img src="/web2203/goods/image/main/林宥嘉.jpg" alt="">
                            <span>说谎<br>林宥嘉</span>
                        </li>
                        <li>
                            <img src="/web2203/goods/image/main/陈奕迅2.jpg" alt="">
                            <span>十面埋伏<br>陈奕迅</span>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        <!-- 底部 -->
        <div class="footer">
            <div class="ft_left">
                <img class="_img" src="/web2203/goods/image/main/周杰伦.jpg" alt="">
                <div class="songNameAndSinger">
                    <span class="songName">晴天<i class="iconfont icon-aixin"></i></span>
                    <span class="singer">周杰伦</span>
                </div>
            </div>

            <div class="ft_main">
                <!-- 播放栏工具 -->
                <ul class="tool_list">
                    <li><i class="iconfont icon-lajitong"></i></li>

                        <li onclick="playPrevious()"><i class="iconfont icon-shangyishoushangyige"></i></li>
                        <li onclick="bofang()"><i class="iconfont icon-bofang _audio"></i>
                            <audio id="ado"></audio>
                        <li onclick="playNext()"><i class="iconfont icon-xiayigexiayishou"></i></li>

                    <li><i class="iconfont icon-geciweidianji"></i></li>
                </ul>
                <!-- 进度条 -->
                <div class="progress">
                    <div class="slide"></div>
                    <div class="fill"></div>
                    <!--歌曲当前时间与总时间  -->
                    <span class="currentTime time">00:00</span>
                    <span class="duraTime time">00:00</span>
                </div>
            </div>

            <ul class="ft_right">
                <li class="jigao">HIFI</li>
                <li class="iconfont icon-yinxiao"></li>
                <li class="iconfont icon-yinliangkai _voice"></li>
                <li class="iconfont icon-yiqipindan"></li>
                <li class="iconfont icon-24gl-playlistMusic"></li>
            </ul>
        </div>
    </div>
    <script src="/web2203/goods/js/listen.js"></script>
</body>
</html>
