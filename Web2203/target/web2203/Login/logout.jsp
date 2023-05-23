<%--
  Created by IntelliJ IDEA.
  User: FengZi
  Date: 2023/5/23
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注销页面</title>
    <meta charset="UTF-8">
    <link href="css/logout.css" rel="stylesheet">
</head>
<body>
    <div id="loginDiv">
        <form action="/web2203/logout" id="form">
            <h1 id="loginMsg">LOGIN IN</h1>
            <p>Username:<input id="username" name="username" type="text" placeholder="请输入注销用户名字"></p>
            <p>Password:<input id="password" name="password" type="password" placeholder="确认注销用户密码"></p>
            <div id="subDiv">
                <input type="submit" class="button" value="logout">
                <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
                <a href="login.jsp">取消注销，前往登录</a>
            </div>
        </form>
    </div>
</body>
</html>
