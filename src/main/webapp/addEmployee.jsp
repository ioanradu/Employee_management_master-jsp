<%--
  Created by IntelliJ IDEA.
  User: Ioan Radu
  Date: 15/09/2019
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%-- <link href="css/loginstyle.css" rel="stylesheet" type="text/css">--%>
    <base href="${pageContext.request.contextPath}">
    <link href="css/login.css" rel="stylesheet" type="text/css">
    <title>Add Employee Page</title>
</head>
<body>
<h1>Add Employee</h1>

<form action="login" method="post">
    <label for="text">Name: </label>
    <input type="text" name="un" id="text" placeholder="your name" required><br/>

    <label for="password">Password: </label>
    <input type="password" name="pw" id="password" required><br/>

    <input type="submit" value="Add Employee" class="submit">

</form>
</body>
</html>