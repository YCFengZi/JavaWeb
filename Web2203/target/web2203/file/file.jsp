<%--
  Created by IntelliJ IDEA.
  User: FengZi
  Date: 2023/6/13
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>文件上传与下载</title>
</head>
<body>
    <h2>文件上传与下载</h2>
    <form action="${pageContext.request.contextPath}/file" method="post" enctype="multipart/form-data">
        <div>文件说明：<input type="text" value="" placeholder="请输入文件说明" name="finfo"></div><br>
        <div><input type="file" name="fname"></div><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
