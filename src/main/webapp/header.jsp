<%@ page import="com.sda.model.User" %><%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="css/loginstyle.css" rel="stylesheet" type="text/css">
    <link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="header" id="header">
    <a href="home.jsp" class="logo"><img src="/images/logo.png"/></a>
    <div class="center">
        <% User currentUser = (User) session.getAttribute("currentSessionUser");%>
        Welcome <span class="user"><%= currentUser.getUsername() %></span> !
    </div>
    <div class="header-right">
        <a class="active" href="home.jsp">Home</a>
        <a href="employees.jsp">Employees</a>
        <a href="departments.jsp">Departments</a>
        <a href="#contact">Contact</a>
        <a href="#about">About</a>
        <a href="logout.jsp">Logout</a>

    </div>

</div>
</body>