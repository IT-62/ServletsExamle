<%--
  Created by IntelliJ IDEA.
  User: Air
  Date: 17.10.2018
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="edu.kryait.servlets.entities.User" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Players</title>
</head>
<body>
<% List<User> users = (List<User>) request.getAttribute("list"); %>
<h1>
    Players
</h1>
<table>
    <tr>
        <th>id</th>
        <th>Username</th>
        <th>Password</th>
    </tr>
    <tbody>
    <% for (User user : users) {%>
    <tr>
        <td><%=user.getId()%></td>
        <td><%=user.getUsername()%></td>
        <td><%=user.getCPass()%></td>
    </tr>
    <%} %>
    </tbody>
</table>


<form action="users" method = "post">
    <div class="form-group">
        <input name="username" class="form-control" placeholder="Username" autocomplete="off">
    </div>
    <div class="form-group">
        <input name="password" class="form-control" placeholder="Password" autocomplete="off">
    </div>
    <button type="submit" class="btn btn-primary btn-sm">Add user</button>
</form>
</body>
</html>
