<%--
  Created by IntelliJ IDEA.
  User: FengZi
  Date: 2023/5/23
  Time: 10:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆页面</title>
    <meta charset="UTF-8">
    <link href="css/login.css" rel="stylesheet">
    <link href="../bootstrap-5.3.0-alpha3-dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body background="imgs/Desert.jpg" style="background-size: 100%;background-attachment: fixed">
    <div id="loginDiv">
        <form action="/web2203/login" id="form" method="get">
            <h1 id="loginMsg">LOGIN IN</h1>
            <p>Username:<input id="username" name="username" type="text"></p>
            <p>Password:<input id="password" name="password" type="password"></p>
            <div id="subDiv">
                <button type="submit" class="btn btn-success">确认</button>
                <button type="reset" class="btn btn-danger">清除</button>
                <a href="register.jsp">没有账号？点击注册</a>
                <br>
                <a href="logout.jsp">有账号？点击注销</a>
            </div>
        </form>
    </div>
</body>
</html>
