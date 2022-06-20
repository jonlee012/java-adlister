<%--
  Created by IntelliJ IDEA.
  User: kimberlyshim
  Date: 6/15/22
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Customize your pizza</h1>

<form name="pizzaForm" method="post" action="PizzaOrderServlet">
<%--    Username: <input type="text" name="username"/> <br/>--%>
<%--    Password: <input type="password" name="password"/> <br/>--%>
<%--    <input type="submit" value="Submit" />--%>
<label for="crust">Choose a crust:</label>

<select name="crust" id="crust">
    <option value="thin">thin</option>
    <option value="original">original</option>
    <option value="cheese">cheese</option>
</select>
    <br>

<label for="sauce">Choose a sauce:</label>

<select name="sauce" id="sauce">
    <option value="white">white</option>
    <option value="marinara">marinara</option>
    <option value="pink">pink</option>
</select>
    <br>

<label for="size">Choose a size:</label>

<select name="size" id="size">
    <option value="small">small</option>
    <option value="medium">medium</option>
    <option value="large">large</option>
</select>
    <br>

<label
<%--        for="topping"--%>
>Choose a Topping:</label>
    <br>

<input type="checkbox" id="topping1" name="topping" value="Pepporoni">
<label for="topping1"> Pepporoni</label><br>
<input type="checkbox" id="topping2" name="topping" value="Veggies">
<label for="topping2"> Veggies</label><br>
<input type="checkbox" id="topping3" name="topping" value="Extra Cheese">
<label for="topping3"> Extra Cheese</label>
    <br>

    <input type="text" id="address" name="address" value="address" placeholder="Enter delivery address">
    <br>
    <input type="submit" value="Submit" />


</form>


</body>
</html>
