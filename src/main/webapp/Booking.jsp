<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Booking</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/Booking.css">
</head>
<body background="images/back.jpg">
<div class="container">

<div class="container mt-4">
  <div class="row justify-content-center">
    <!-- Card 1 -->
    <div class="col-md-3">
      <div class="card" style=" display:inline-flex;justify-content: center;margin: 20px;">
        <img src="images/dj.jpg" class="card-img-top" alt="DJ Music">
        <div class="card-body">
          <h5 class="card-title">DJ Music</h5>
          <a href="#" class="btn btn-primary" onclick="window.location.href='BookForm.jsp';">BOOK NOW</a>
        </div>
      </div>
    </div>
    <!-- Card 2 -->
    <div class="col-md-3">
      <div class="card" style="display:inline-flex;justify-content: center;margin: 20px">
        <img src="images/chenda.jpg" class="card-img-top" alt="Chenda Melam">
        <div class="card-body">
          <h5 class="card-title" >Chenda Melam</h5>
          <a href="#" class="btn btn-primary" onclick="window.location.href='BookForm.jsp';">BOOK NOW</a>
        </div>
      </div>
    </div>
    <!-- Card 3 -->
    <div class="col-md-3">
      <div class="card" style="display:inline-flex;justify-content: center;margin: 20px;">
        <img src="images/cinematic.jpg"  class="card-img-top" alt="DJ Music" >
        <div class="card-body">
          <h5 class="card-title">Cinematic</h5>
          <a href="#" class="btn btn-primary" onclick="window.location.href='BookForm.jsp';">BOOK NOW</a>
        </div>
      </div>
    </div>
    <!-- Card 4 -->
    <div class="col-md-3">
      <div class="card" style="display: inline-flex;justify-content: center;margin: 20px;">
        <img src="images/fusion.jpg" class="card-img-top" alt="Chenda Melam">
        <div class="card-body">
          <h5 class="card-title">Fusion</h5>
          <a href="#" class="btn btn-primary" onclick="window.location.href='BookForm.jsp';">BOOK NOW</a>
        </div>
      </div>
    </div>
  </div>
</div> </div>
</body>
</html>