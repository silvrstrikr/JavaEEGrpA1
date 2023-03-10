<%@ page import="java.sql.ResultSet" %>
<%--
  Created by IntelliJ IDEA.
  User: Mlane
  Date: 2023-02-27
  Time: 12:36 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Geographic Area</title>
  <link rel="stylesheet" href="lib/css/bootstrap.css" />
  <script src="lib/js/bootstrap.bundle.js"></script>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body >
<header>
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/HomePage.jsp">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/GeographicArea">Geographic Area</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/Census">Gender Population</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>
<main class="w-75 p-lg-3" style="margin-left: 13.5em;">
  <div>
    <h1 class="text-center">List of areas in canada, with respective levels</h1>
  </div>
<div class="row">
  <div class="col-5">
    <h6>Click on area name to view it's details</h6>
    <table class="table">
      <thead class="table-dark">
      <tr>
        <th scope="col">Level</th>
        <th scope="col">Name</th>
      </tr>
      </thead>
      <tbody>
      <%
        ResultSet rs = (ResultSet) request.getAttribute("resultSet");
        while (rs.next()) {
      %>
      <tr>
        <td><%= rs.getInt("level") %></td>
        <td><a href="<%=request.getContextPath()%>/Detail?id=<%= rs.getInt("geographicAreaID") %>"><%=  rs.getString("name") %></a></td>
      </tr>
      <% } %>
      </tbody>
    </table>
  </div>
</div>
</main>
</body>
</html>
