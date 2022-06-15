<%--
  Created by IntelliJ IDEA.
  User: kimberlyshim
  Date: 6/13/22
  Time: 3:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<%--<%! String name = "jon"; %>--%>
<% counter += 1; %>
<%--<!doctype html>--%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>The current count is <%= counter  %>. Hello
<%--    <%= String name %>--%>
</h1>
View the page source!

<% request.setAttribute("numbers", new int[]{1, 2, 3, 4, 5, 6, 7}); %>
<ul>
    <c:forEach items="${numbers}" var="n">
        <li>${n}</li>
    </c:forEach>
</ul>
<%--<p>Path: <%= request.getRequestURL() %></p>--%>
<%--<p>Query String: <%= request.getQueryString() %></p>--%>
<%--<p>"name" parameter: <%= request.getParameter("name") %></p>--%>
<%--<p>"method" attribute: <%= request.getMethod() %></p>--%>
<%--<p>User-Agent header: <%= request.getHeader("user-agent") %></p>--%>
<%--hi--%>

</body>
</html>
