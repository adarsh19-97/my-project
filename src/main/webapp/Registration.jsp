<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Register.css">
</head>
<body background="images/register.jpg"> 
<center><h1>Welcome to Music World</h1> <br>
<h2>Registration</h2><br></center>
<div class="container">
<form action="RegisterServlet" method="post">
  Enter your name:  <input type="text" name="Name" /> <br>
  Enter your Email: <input type="text" name="Email"/><br>
  Enter Password:   <input type="password" name ="Password" /><br>
  Mobile Number:    <input type="number" name ="MobileNumber"/><br>
   <input type="submit" name ="submit"/><br>
   <p>Already have an account? </p>
  <a href="Login.jsp">Click here</a>
</form></div>
</body>
</html>