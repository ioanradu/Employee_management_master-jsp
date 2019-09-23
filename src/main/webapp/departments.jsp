<%--
  Created by IntelliJ IDEA.
  User: Ioan Radu
  Date: 17/09/2019
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:useBean id="departmentService" class="com.sda.service.DepartmentService"></jsp:useBean>
<jsp:useBean id="userService" class="com.sda.service.UserService"></jsp:useBean>

<html>
<head>
    <base href="${pageContext.request.contextPath}">
    <link href="css/departaments.css" rel="stylesheet" type="text/css">
    <title>Departments</title>
</head>
<jsp:include page="header.jsp"/>

<body>
<div class="departments">
    <h1>Available<br/>Departments</h1>
    <%-- <span> <c:out value="${departmentService.findById(1).getName()}"/> </span> --%>
    <table>
        <tr>
            <th>Id</th>
            <th>Name</th>
        </tr>
        <c:forEach items="${departmentService.departmentsListFromDao}" var="department" varStatus="loop">
            <tr>
                <td><c:out value="${department.getId()}"/></td>
                <td><c:out value="${department.getName()}"/></td>
            </tr>
        </c:forEach>
    </table>
    <a href="addDepartment.jsp" alt="add a new department"><span>Add Department</span></a>
</div>

</body>
</html>
