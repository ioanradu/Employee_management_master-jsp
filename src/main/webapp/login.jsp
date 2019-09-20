<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>

<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%-- <link href="css/loginstyle.css" rel="stylesheet" type="text/css">--%>
    <base href="${pageContext.request.contextPath}">
    <link href="css/login.css" rel="stylesheet" type="text/css">
    <title>Login Page</title>
</head>

<body>

<section>
    <h1>Sign In</h1>
    <form action="login" method="post">
        <label for="text">Name: </label>
        <input type="text" name="un" id="text" placeholder="your name" required><br/>

        <label for="password">Password: </label>
        <input type="password" name="pw" id="password" required><br/>

        <input type="submit" value="Sign In" class="submit">

    </form>

</section>
</body>
</html>