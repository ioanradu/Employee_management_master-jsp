<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.sda.model.Employee" %><%--
  Created by IntelliJ IDEA.
  User: Ioan Radu
  Date: 21/09/2019
  Time: 11:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<!Doctype html>
<html>
<head>
    <base href="${pageContext.request.contextPath}">
    <link href="css/employees.css" rel="stylesheet" type="text/css">
    <title>Employees Of Manager</title>

</head>
<jsp:include page="header.jsp"/>
<body>
<div>

    <h1>Employees of the ${manager.name} !</h1>
    <table class="manager">
        <tr>
            <th>Id</th>
            <th>Name</th>
        </tr>
        <c:forEach items="${manager.managerList}" var="employee" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <td>${employee.name}</td>
            </tr>
        </c:forEach>
    </table>

</div>

</body>
</html>
