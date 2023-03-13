<%--
  Created by IntelliJ IDEA.
  User: hungho
  Date: 3/10/23
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
  <h1>Pizza Ordering</h1>
  <form method="POST">
    <label for="crust">Crust Type </label>
      <select name="crust" id="crust">
        <option>Thin Crust</option>>
        <option>Think Crust</option>
        <option>Pan</option>
      </select>
    <label for="sauce">Sauce</label>
        <select name="sauce" id="sauce">
          <option>Tomato Sauce</option>
          <option>White Sauce</option>
        </select>
    <label for="size">Size</label>
      <input name="size" id="size" type="text" placeholder="Small/Medium/Large/XLarge"/>
    <label for="pepperoni">Pepperoni</label>
      <input name="topping" id="pepperoni" type="checkbox" value="pepperoni"/>
    <label for="mushroom">Mushroom</label>
      <input name="topping" id="mushroom" type="checkbox" value="mushroom"/>
    <label for="sausage">Sausage</label>
      <input name="topping" id="sausage" type="checkbox" value="mushroom"/>
    <label for="extra-cheese">Extra-cheese</label>
      <input name="topping" id="extra-cheese" type="checkbox" value="extra-cheese"/>
    <lable for="address">Delivery address</lable>
      <input name="address" id="address" type="text"/>
    <button>Submit</button>
  </form>
</body>
</html>
