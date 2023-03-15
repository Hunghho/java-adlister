<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <div class="container">
        <h1>Viewing your profile.</h1>
        <h3>Hello ${user}</h3>
    </div>
    <footer>
        <form action = "/logout" method = "POST">
            <label for="logout">Logout
                <input name="logout" id="logout" type="submit"/>
            </label>
        </form>
    </footer>

</body>
</html>
