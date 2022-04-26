<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Purchase reports</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="container">
  <div class="top"> 
			<div class="cl1">
				<h3>SportyShoes</h3>
			</div>
			<div class="cl9">
				<h3>SportyShoes : Be a best fitness freak with SportyShoes </h3>
			</div>
		</div>
  
 <header>
  	<nav>
  	<ul>
  		<li>
  			<a href="/welcome">Home</a>
  		</li>
  		<li>
  			<a href="/changepassword">Change Password</a>
  		</li>
  		<li>
  			<a href="/product">Product related operations </a>
  		</li>
  			<li>
  			<a href="/user">Users</a>
  		</li>
  		
  		</ul>
  	</nav>
  </header>
  <div class="main">
  	<div class="sec1">
<h2>Choose method to see purchase reports</h2>
<h3><a href="/allpurchase">All purchase reports</a></h3>
<br>
<h3>Purchase reports by date:</h3>
<form action="/datepurchase" method="post">
	<label for="date">Date:</label>
	<input type="date" name="date">
	<button type="submit" class="csub">Get Reports</button>
</form>
<h3>Purchase reports by category:</h3>
<form action="/typepurchase" method="post">
	<select name="type">
	<option value="cod">Cash on delivery</option>
	<option value="onlinepay">Online payment</option>
</select>
<button type="submit" class="csub">Get Reports</button>
</form>

</div></div></div>
</body>
</html>