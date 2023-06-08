<%--
  Created by IntelliJ IDEA.
  User: FengZi
  Date: 2023/6/8
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品添加</title>
</head>
<body>
    <h2>商品添加</h2>
    <form action="/web2203/add" id="form" method="get">
        <p>商品名字：<input type="text" id="name" name="name"></p>
        <p>商品价格：<input type="text" id="price" name="price"></p>
        <p>商品介绍：<input type="text" id="information" name="information"></p>
        <button type="submit" class="btn btn-success">确认</button>
        <button type="reset" class="btn btn-danger">重置</button>
    </form>
</body>
</html>
