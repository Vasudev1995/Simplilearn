<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change Password</title>
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
  		</ul>
  	</nav>
  </header>
  <div class="main">
  	<div class="sec1">
  		<form action="/adminupdate" method="post">
  			<table>
  				
  				<tr>
  					<th><label for="name">Name:</label></th>
  					<th><input type="text" name="name" placeholder="Enter name here"></th>
  				</tr>
  				
  				<tr>
  					<th><label for="oldpassword">OldPassword:</label></th>
  					<th><input type="password" name="oldpassword" placeholder="Enter Old Passworde"></th>
  				</tr>
  				<tr>
  					<th><label for="newpassword">NewPassword:</label></th>
  					<th><input type="text" name="newpassword" placeholder="Enter New Passworde"></th>
  				</tr>
  				<tr>
  					<th><button type="submit">Submit</button></th>
  					<th><button type="reset">Reset</button></th>
  				</tr>
  			</table>
  		</form>
  	</div>
  </div>
  </div>
</body>
</html>