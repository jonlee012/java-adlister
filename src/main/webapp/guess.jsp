<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("navbar", "Number"); %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Guess Number"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>

<div class="container">
    <form method="POST" action="/GuessNumberServlet">
        <h1>Guess a Number</h1>
        <div>
            <span>Guess a number between 1 and 3:</span>
            <label for="number">
                <input type="text" id="number" name="number">
            </label>
        </div>
        <br>
        <input type="submit" class="btn btn-primary" value="submit">
    </form>
</div>

</body>
</html>