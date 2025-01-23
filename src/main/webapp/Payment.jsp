<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment</title>
<link rel="stylesheet" href="css/Payment.css">
</head>
<body background="images/pay.jpg">
<h1>PAYMENT METHOD</h1>
<div class="container">

 <label>UPI Payment:</label>
 <select name="UPI Payment " id="UPI Payment">
 <option value="Gpay">Gpay</option>
			<option value="PhonePe">PhonePe</option>
 <option value="Paytm">Paytm</option> </select> <br>
 <label>Debit/Credit card:</label>
 <select name="cards" id="card">
 <option value="Gpay">VISA</option></select> <br>
 <form>
	Card Number:<input type="number" name ="CardNumber"/><br>		</form>
	<button type="button" name="Button" onclick="window.location.href='Success.jsp';">Payment Now</button>
	
</div>

</body>
</html>