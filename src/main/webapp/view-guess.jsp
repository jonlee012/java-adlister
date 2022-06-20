<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("navbar", "Number"); %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="View Guess"/>
    </jsp:include>
</head>
<body>
<jsp:include page="partials/navbar.jsp"/>

<div class="container">
    <h1>${message}</h1>
</div>

</body>
</html>