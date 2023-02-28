<%--
  Created by IntelliJ IDEA.
  User: Mlane
  Date: 2023-02-24
  Time: 1:13 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Age Data</title>
    <link rel="stylesheet" href="lib/css/bootstrap.css" />
    <script src="lib/js/bootstrap.bundle.js"></script>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>

<body>
<div>
    <p class="text-center">Age Data</p>
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
                <th scope="col">Age Group</th>
                <th scope="col">Census Year</th>
                <th scope="col">Geographic Area</th>
                <th scope="col">Combined</th>
                <th scope="col">Male</th>
                <th scope="col">Female</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>1</td>
                <td>1</td>
                <td>35151725</td>
                <td>17264200</td>
                <td>17887530</td>
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
