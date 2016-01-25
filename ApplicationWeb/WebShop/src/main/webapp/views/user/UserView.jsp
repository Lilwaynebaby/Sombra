
<%@ page language="java" pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
    <meta charset="utf-8">
    <title>WEB-SHOP</title>
</head>
<body>
<header>
    <div class="header-bg">
    </div>
</header>

<a href="${pageContext.servletContext.contextPath}/views/user/UserRegistration.jsp"><button>Add New User</button></a>
<table border="2">
    <tr>
        <td>Login & Email</td>
        <td>Action</td>
    </tr>
    <c:forEach items="${users}" var="user" varStatus="status">
        <tr valign="top">
            <td>${user.login} ${user.mail}</td>
            <td>
                <a href="${pageContext.servletContext.contextPath}/edit?id=${user.id}">Edit</a>
                <a href="${pageContext.servletContext.contextPath}/delete?id=${user.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
