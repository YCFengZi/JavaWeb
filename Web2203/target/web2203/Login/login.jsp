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
</head>
<body>
    <div id="loginDiv">
        <form action="/web2203/login" id="form" method="get">
            <h1 id="loginMsg">LOGIN IN</h1>
            <p>Username:<input id="username" name="username" type="text"></p>
            <p>Password:<input id="password" name="password" type="password"></p>
            <div id="subDiv">
                <input type="submit" class="button" value="login up" placeholder="请输入用户名">
                <input type="reset" class="button" value="reset" placeholder="请输入密码">&nbsp;&nbsp;&nbsp;
                <a href="register.jsp">没有账号？点击注册</a>
                <br>
                <a href="logout.jsp">有账号？点击注销</a>
            </div>
        </form>
    </div>
</body>
</html>
