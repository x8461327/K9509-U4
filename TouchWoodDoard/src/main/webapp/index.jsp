<%--
  Created by IntelliJ IDEA.
  User: MI
  Date: 2019/12/24 0024
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>鑫鑫木业管理系统(登录界面)</title>
    <script type="text/javascript" src="wood/js/jquery-1.8.3.js"></script>
    <link href="wood/easyUI/css/style.css" rel="stylesheet" type="text/css" media="all" />
    <script>

    </script>
</head>
<body>
  <!-- main -->
<div class="main">
    <h1>
        鑫鑫木业管理系统
    </h1>
    <center>
        ${msg}<br>
    </center>
    <form action="${pageContext.request.contextPath}/url" method="post">
        <input type="text" name="username" id="username" placeholder="账号" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '';}"
               required="">
        <input type="password" name="password" id="password" placeholder="密码" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '';}"
               required="">
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>
