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

<body>
<div>
  <p class="text-center">Geographic Area</p>
</div>
<header>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Navbar</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Geographic Area</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Census</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Age</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
</header>

<div class="row">
  <div class="col-5">
    <table class="table">
      <thead class="table-dark">
      <tr>
        <th scope="col">Code</th>
        <th scope="col">Level</th>
        <th scope="col">Name</th>
        <th scope="col">Alternative Code</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <th scope="row">1</th>
        <td>0</td>
        <td>Canada</td>
        <td>1</td>
      </tr>
      <tr>
        <th scope="row">1</th>
        <td>10</td>
        <td>1</td>
        <td>Newfoundland and Labrador</td>
        <td>10</td>
      </tr>
      </tbody>
    </table>
  </div>
  <%--    <div class="col-5">--%>
  <%--        <h1>dfrtgyhjuki</h1>--%>
  <%--    </div>--%>
</div>

</body>
</html>
