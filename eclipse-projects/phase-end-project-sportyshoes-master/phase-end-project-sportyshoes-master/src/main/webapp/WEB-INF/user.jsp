<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin User</title>
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
  		<a href="/purchase">Purchase reports</a>
  		</li>
  		</ul>
  	</nav>
  </header>
  <div class="main">
  <div class="sec1">
 	 <h2>Admin can access following data</h2>
 	 <h3>All Signed up users</h3>
 	   <a href="/allusers">Link to access all users</a>
 	   <h3>Search User by name</h3>
 	   <form action="/nameuser" method="post">
 	   <label for="name">Name:</label>
 	   <input type="text" name="name" placeholder="Enter name to search for">
 	   <button type="submit" class="csub">Submit</button>
 	   	   <button type="reset" class="creset">Reset</button>
 	   </form>
 	   <h3>Search User by Email</h3>
 	    <form action="/emailuser" method="post">
 	   <label for="email">Email:</label>
 	   <input type="email" name="email" placeholder="Enter email to search for">
 	    <button type="submit" class="csub">Submit</button>
 	   	   <button type="reset" class="creset">Reset</button>
 	   </form>
 	   </div>
  </div>
  </div>
</body>
</html>