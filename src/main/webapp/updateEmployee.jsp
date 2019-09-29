<%@ page import="com.sda.model.Employee" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Ionel Radu
  Date: 9/29/2019
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>
<!DOCTYPE html>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <%-- <link href="css/loginstyle.css" rel="stylesheet" type="text/css">--%>
    <base href="${pageContext.request.contextPath}">
    <link href="css/login.css" rel="stylesheet" type="text/css">

    <title>Update Employee Page</title>
</head>
<jsp:include page="header.jsp"/>
<body>
<section>
    <h1>Update Employee</h1>

    <form action="update-Employee" method="post">

        <input type="hidden" name="id" id="id" value="${employee.getId()}">

        <label for="updateEmployee">Name: </label>
        <input type="text" id="updateEmployee" name="un" value="${employee.getName()}">

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

        <input type="submit" value="Update" class="submit">

    </form>
</section>
</body>
</html>

