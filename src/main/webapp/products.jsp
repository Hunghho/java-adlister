<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: hungho
  Date: 3/10/23
  Time: 10:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    Product product1 = new Product("Hammer", 95);
    Product product2 = new Product("Nails", 25);
    Product product3 = new Product("papers", 5);

    List<Product> products = new ArrayList<>(Arrays.asList(
       product1,
       product2,
       product3
    ));

    request.setAttribute("products", products);

%>

<html>
<head>
    <title>Product Page</title>
</head>
<body>
    <h1>Products</h1>
    <div class="card">
        <c:forEach var="product" items="${products}">
            <h3>${product.name}</h3>
            <h3>${product.costInCents}</h3>
        </c:forEach>

    </div>


</body>
</html>
