<%@ page language="java" pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
</head>
<body>
    <form action="${pageContext.servletContext.contextPath}/edit" method="POST">
        <input type="hidden" name="id" value="${user.id}">
        <table>
            <tr>
                <td align="right" >Login : </td>
                <td>
                    <input type = "text" name="login">
                </td>
            </tr>
            <tr>
                <td align="right" >Email : </td>
                <td>
                    <input type = "text" name="mail">
                </td>
            </tr>
            <tr>
                <td><input type="submit" align="center" value="Submit"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
