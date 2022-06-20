<%--
  Created by IntelliJ IDEA.
  User: kimberlyshim
  Date: 6/17/22
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("navbar", "Color"); %>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="viewColor"/>
    </jsp:include>
</head>

<body style="background-color: ${color}">
<jsp:include page="partials/navbar.jsp"/>
</body>
</html>
