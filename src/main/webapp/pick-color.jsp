<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("navbar", "Color"); %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Pick Color"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>

<div class="container">
    <form name="colorForm" method="post" action="ViewColorServlet">
        <div>
            <label for="color">
                <input type="text" id="color" name="color">
            </label>
        </div>
        <br>
        <input type="submit" class="btn btn-primary" value="submit" placeholder="enter your favorite colo">
    </form>
</div>

</body>
</html>