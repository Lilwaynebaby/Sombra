<%@ page language="java" pageEncoding="UTF-8" session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="css/style.css" rel="stylesheet">
    <link rel="shortcut icon" href="images/favicon.png" type="image/x-icon">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/bootstrap.css   " rel="stylesheet">
    <link href="js/bootstrap.min.js" rel="stylesheet" media="screen">
    <link href="js/bootstrap.js" rel="stylesheet" media="screen">
    <link href="js/npm.js" rel="stylesheet" media="screen">


    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Web_shop</title>
    <style>
        body{
            background-image: url(images/Background.jpg);
        }
    </style>
    <!-- Bootstrap -->


    <!-- Вставка HTML5 поєднується з Respond.js для підтримки в IE8 елементів HTML5 та медіа-запитів -->
    <!-- ЗАСТЕРЕЖЕННЯ: файл Respond.js не працює, якщо ви проглядаєте сторінку відкривши її з файлової системи -->
    <!--[if lt IE 9]>
    <!--<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <!--<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<header>
    <div class="header-bg">
    </div>
</header>
<form action="${pageContext.servletContext.contextPath}/create" method="POST">
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
