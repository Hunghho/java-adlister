<%--
  Created by IntelliJ IDEA.
  User: hungho
  Date: 3/9/23
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%
  String userName = request.getParameter("userName");
  String userPassword = request.getParameter("userPassword");
  if (userName == null) {
  } else if (userName.equals("admin") && userPassword.equals("password")) {
      response.sendRedirect("/profile.jsp");
    } else{
      response.sendRedirect("/login.jsp");
  }


%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
  <form action = "/login.jsp" method = "POST">
    <lable>username</lable>
    <input name="userName" type="text" placeholder="username">
    <lable>password</lable>
    <input name="userPassword" type="password" placeholder="password">
    <button>submit</button>
  </form>
</body>
</html>
