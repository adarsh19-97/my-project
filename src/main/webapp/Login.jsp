<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="css/Login.css">
</head >
<body background="images/login.jpg"> 
<div class="container">
<h1>Login</h1>
<form action="LoginServlet" method="post">
Email :<input type ="email" name= "Email"/> <br>
Password : <input type="password" name="Password"/> <br>
 <input type="submit" name="Sign in">
</form></div>
</body>
</html>