<%--
  Created by IntelliJ IDEA.
  User: NicolaeA
  Date: 16.02.2019
  Time: 02:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="employeeService" class="com.sda.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <base href="${pageContext.request.contextPath}">
    <link href="css/employees.css" rel="stylesheet" type="text/css">
    <title>Employees</title>

</head>
<jsp:include page="header.jsp"/>

<body>

<div class="employees">
    <h1>Employees</h1>
    <%--<span> <c:out value="${employeeService.findById(1).getName()}"/> </span> --%>
    <%--<c:forEach items="${employeeService.findById(1)}" var="employee">--%>
    <%--<span><c:out value="${employee.getName()}"/></span>--%>
    <%--</c:forEach>--%>
    <%--<c:forEach items="${userService.findById(1)}" var="user">--%>
    <%--<span><c:out value="${employee.getUsername()}"/></span>--%>
    <%--</c:forEach>--%>

    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Position</th>
            <th>Manager</th>
            <th>Department</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${employeeService.employeesListFromDao}" var="employee" varStatus="loop">
            <tr>
                <td><c:out value="${loop.count}"/></td>
                <td><c:out value="${employee.getName()}"/></td>
                <td><c:out value="${employee.getFunction()}"/></td>

                <td><a href="employeesOfManager?id=${employee.manager.id}" alt="employees-of-manager">
                    <c:out value="${employee.getManager().getName()}"/></a>
                </td>
                <td><c:out value="${employee.department.name}"/></td>

                <td>
                    <span><a href="deleteEmployee?action=deleteEmployee&id=${employee.getId()}" class="small">Delete</a></span>

                    <span><a href="updateEmployee?action=updateEmployee&id=${employee.getId()}" class="small">Update</a></span>
                </td>
            </tr>
        </c:forEach>

    </table>
    <a href="addEmployee.jsp" class="employee" alt="add a new employee"><span>Add Employee</span></a>

</div>
</body>
</html>
