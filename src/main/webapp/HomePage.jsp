<%--
  Created by IntelliJ IDEA.
  User: Mlane
  Date: 2023-02-24
  Time: 12:57 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Statistics Canada</title>
    <link rel="stylesheet" href="lib/css/bootstrap.css" />
    <script src="lib/js/bootstrap.bundle.js"></script>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
</head>
<body style="background-image: linear-gradient(#000b38,white, #000b38); ">
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
<div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-inner">
        <div class="carousel-item active">
            <img src="images/banner1.png" class="d-block w-100 h-50" alt="...">
        </div>
        <div class="carousel-item">
            <img src="images/banner2.jpg" class="d-block w-100 h-50" alt="...">
        </div>
        <div class="carousel-item">
            <img src="images/banner3.png" class="d-block w-100 h-50" alt="...">
        </div>
    </div>
</div>
    <div class="d-flex justify-content-center">
    <div class="row my-2 mx-2">
        <div class="col-6">
            <div class="card" style="width: 18rem;">
                <div class="card-body">
                    <h5 class="card-title">Area List</h5>
                    <p class="card-text">Areas in canada are divided into levels, checkout full list from here. </p>
                    <a href="<%=request.getContextPath()%>/GeographicArea" class="btn btn-outline-primary">Geographic Area List</a>
                </div>
            </div>
        </div>
        <div class="col-6">
            <div class="card" style="width: 18rem;">

                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">We have made comparison in population reported in 2021 and 2016 census. Check it from here</p>
                    <a href="<%=request.getContextPath()%>/Census" class="btn btn-outline-success">Population Details</a>
                </div>
            </div>
        </div>
    </div>
    </div>
</main>
</body>
</html>
