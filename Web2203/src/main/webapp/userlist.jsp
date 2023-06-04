<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %>
<%@ page import="net.zjitc.domain.User" %>
<%@ page import="net.zjitc.Dao.UserDao" %>
<%@ page import="net.zjitc.Dao.Impl.UserDaoImpl" %>
<%--
  Created by IntelliJ IDEA.
  User: FengZi
  Date: 2023/6/1
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<%
    UserDao userDao = new UserDaoImpl();
    List<User> list = userDao.FindAll();
%>
<%--<% for (User u : list) { %>--%>
<%--    <h2>--%>
<%--        <%= u.getUsername()%>--%>
<%--        <%= u.getPassword()%>--%>
<%--    </h2>--%>
<%--<% } %>--%>

<c:forEach items="<%=list%>" var="u" step="1">
    <h2>${u.username},${u.password}</h2>
</c:forEach>
</body>
</html>
