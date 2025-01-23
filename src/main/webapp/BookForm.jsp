<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book form</title>
<link rel="stylesheet" href="css/Book.css">
</head>
<body background="images/back1.jpg">`
<h1 style="color: white">Enter the Details</h1>
<div class="container">
<form action="BookServlet" method="post" style="color: white">
  Venue :  <input type="text" name="Venue" /> <br>
  Date : <input type="date" name="Date"/><br>
  Time:   <input type="time" name ="Time" /><br>
  Email : <input type ="email"  name="Email"/><br>
  Contact Number:    <input type="number" name ="MobileNumber"/><br>
  Full Address: <input type ="address" name="Address"/>
    <br>
   <input type="submit" name ="submit"/><br>
</form></div>
</body>
</html>