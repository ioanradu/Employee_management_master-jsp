<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%-- <link href="css/loginstyle.css" rel="stylesheet" type="text/css">--%>
    <base href="${pageContext.request.contextPath}">
    <link href="css/login.css" rel="stylesheet" type="text/css">
    <title>Add Employee Page</title>
</head>
<jsp:include page="header.jsp"/>
<body>
<section>
    <h1>Add Employee</h1>

    <form action="addEmployee" method="post">
        <label for="text">Name: </label>
        <input type="text" name="un" id="text" placeholder="name" required><br/>

        <label for="position">Position: </label>
        <input type="text" name="po" id="position" placeholder="position" required><br/>

        <label for="department">Department:</label>
        <select id="department" name="department">
            <%--        <option selected>Select an department</option>--%>
            <%--        <option value="Management">Management</option>--%>
            <%--        <option value="Marketing">Marketing</option>--%>
            <%--        <option value="Sales">Sales</option>--%>
            <%--        <option value="HR">HR</option>--%>
            <c:forEach items="${departmentService.departmentsListFromDao}" var="dep">
                <option value="${dep.getName()}">${dep.getName()}</option>
            </c:forEach>
        </select>
        <br/>

        <input type="submit" value="Add" class="submit">

    </form>
</section>
</body>
</html>
