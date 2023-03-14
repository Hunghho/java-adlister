<%--
  Created by IntelliJ IDEA.
  User: hungho
  Date: 3/14/23
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Ads</title>
</head>
<body>
  <h1>Ads</h1>
  <c:forEach var = "ads" items = "${ads}">
      <div>
          <h3>${ads.title}</h3>
          <h4>${ads.description}</h4>
      </div>
  </c:forEach>


</body>
</html>
