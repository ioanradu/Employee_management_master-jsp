<%--
  User: Cristian
  Date: 9/21/2019
  Time: 2:03 PM
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
    <title>Add Department Page</title>
</head>
<jsp:include page="header.jsp"/>
<body>
<section>
    <h1>Add Department</h1>
    <form action="addDepartment" method="post">

        <label for="text">Nume:</label>
        <input type="text" name="un" id="text" placeholder="name" required><br/>
        <br/>
        <input type="submit" value="Add" class="submit">

    </form>
</section>

</body>
</html>
