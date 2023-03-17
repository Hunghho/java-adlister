<%--
  Created by IntelliJ IDEA.
  User: hungho
  Date: 3/17/23
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
    <h1>Register</h1>
    <hr>
    <form method="POST" action="/register">
        <label for="username">Username</label>
        <input name="username" id="username" type="text"/><br>
        <label for="email">Email</label>
        <input name="email" id="email" type="email"/><br>
        <label for="password">Password</label>
        <input name="password" id="password" type="password"/><br>
        <button>Submit</button>
    </form>


</body>
</html>
