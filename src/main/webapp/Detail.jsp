<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Mlane
  Date: 2023-02-24
  Time: 12:57 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <title>Household Census</title>
  <link rel="stylesheet" href="lib/css/bootstrap.css" />
  <script src="lib/js/bootstrap.bundle.js"></script>
  <meta charset="utf-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body>
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
    <h1 class="text-center">Area details</h1>
  </div>
  <div class="row">
    <div class="col-7">
  <%
    ResultSet rs = (ResultSet) request.getAttribute("resultSet");
    while (rs.next()) {
  %>
  <dl class="row">
    <dt class = "col-sm-2">
      Name
    </dt>
    <dd class = "col-sm-10">
      <%= rs.getString("name") %>
    </dd>
    <dt class = "col-sm-2">
      Code
    </dt>
    <dd class = "col-sm-10">
      <%= rs.getString("code") %>
    </dd>
    <dt class = "col-sm-2">
      Level
    </dt>
    <dd class = "col-sm-10">
      <%= rs.getString("level") %>
    </dd>
    <dt class = "col-sm-2">
      Population
    </dt>
    <dd class = "col-sm-10">
      <%= rs.getString("total") %>
    </dd>
  </dl>
  <% } %>
      <div>
        <a href="<%=request.getContextPath()%>/GeographicArea" >Back to Geographic Area</a>
      </div>
    </div>
  </div>
</main>
</body>
</html>
