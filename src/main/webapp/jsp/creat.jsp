<%--
  Created by IntelliJ IDEA.
  User: yangnk
  Date: 2018/5/9
  Time: 下午5:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="save" method="post">
    <fieldset>
        <legend>创建用户</legend>
        <p>
            <label>姓名：</label> <input type="text" id="name" name="name" tabindex="1">
        </p>
        <p>
            <label>年龄：</label> <input type="text" id="age" name="age" tabindex="2">
        </p>
        <p>
            <label>密码：</label> <input type="text" id="pwd" name="pwd" tabindex="3">
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4" value="取消">
            <input id="submit" type="submit" tabindex="5" value="创建">
        </p>
    </fieldset>
</form>
</body>
</html>
