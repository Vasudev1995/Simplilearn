<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome </title>
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
  		<h2>Welcome you are Successfully logged in</h2>
  <h3>All Products in Store</h3>
		<h3>
			<a href="/allproductuser">Link to access all products</a>
		</h3>
		<h3>Search product by name</h3>
		<form action="/nameproductuser" method="post">
			<label for="name">Name:</label> <input type="text" name="name"
				placeholder="Enter name to search for"><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>


		<h3>Search product by Colour</h3>
		<form action="/colourproductuser" method="post">
			<label for="colour">Colour:</label> <select name="colour">
				<option value="red">Red</option>
				<option value="black">Black</option>
				<option value="white">White</option>
				<option value="pink">Pink</option>
				<option value="yellow">Yellow</option>
				<option value="blue">Blue</option>
			</select><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>
		<h3>Search product by category</h3>
		<form action="/categoryproductuser" method="post">
			<label for="category">Category:</label> <select name="category">
				<option value="mens">Mens</option>
				<option value="womens">Womens</option>
				<option value="kids">Kids</option>
			</select><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>
		<h3>Search product by price</h3>
		<form action="/priceproductuser" method="post">
			<label for="price">Price:</label> <input type="number" name="price"
				placeholder="Enter price to search for"><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>
  	</div>
  </div>
  
		</div>
</body>
</html>