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

<body class="bg-secondary">
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
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
                        <a class="nav-link" href="GeographicArea.jsp">Geographic Area</a>
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
    <div class="row my-2 mx-2">
        <div class="col-4">
            <div class="card" style="width: 18rem;">

                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="GeographicArea.jsp" class="btn btn-primary">Geographic Area</a>
                </div>
            </div>
        </div>
        <div class="col-4">
            <div class="card" style="width: 18rem;">

                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="" class="btn btn-primary">Area Details</a>
                </div>
            </div>
        </div>
        <div class="col-4">
            <div class="card" style="width: 18rem;">

                <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="Age.jsp" class="btn btn-primary">Age List</a>
                </div>
            </div>
        </div>


    </div>

</main>

<!-- <div>
    <h2>Welcome to Sample Statistics Canada</h2>
</div><img id="flag" src="images/Flag-Canada.jpg" alt="Canadian flag" aria-label="Canadian flag"> -->

</body>
</html>
