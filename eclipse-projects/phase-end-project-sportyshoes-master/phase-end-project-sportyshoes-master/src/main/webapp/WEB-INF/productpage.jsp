<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product page</title>
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
  			<a href="/user">Users</a>
  		</li>
  		<li>
  		<a href="/purchase">Purchase reports</a>
  		</li>
  		</ul>
  	</nav>
  </header>
  <div class="main">
  	<div class="sec1">
	<div>
		<h1>Admin can access following data</h1>
		<h2>Add product to store</h2>
		<form action="/createproduct" method="post">
			<label for="name">Name:</label> <input type="text" name="name"
				placeholder="Enter name"><br> <label for="colour">Colour:</label>
			<select name="colour">
				<option value="red">Red</option>
				<option value="black">Black</option>
				<option value="white">White</option>
				<option value="pink">Pink</option>
				<option value="yellow">Yellow</option>
				<option value="blue">Blue</option>
			</select><br> <label for="category">Category:</label> <select
				name="category">
				<option value="mens">Mens</option>
				<option value="womens">Womens</option>
				<option value="kids">Kids</option>
			</select> <br> <label for="price">Price:</label> <input type="number"
				name="price" placeholder="Enter price"><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>
		<h2>Remove product from Store list</h2>
		<form action="/deleteproduct" method="post">
		<h3>Select id of product to remove</h3><br>
		<input type="number" name="id" min="1"  >
		<button type="submit" class="creset">Remove</button>
		</form>
		<h2>Update product from store</h2>
		<form action="/updateproduct" method="post">
		<label for="id">Id of the product to update:</label> <br>	
		<input type="number" name="id" placeholder="Enter Id"><br>
		<h3>Enter updated details of product below</h3>
		<label for="name">Name:</label> 
		<input type="text" name="name" placeholder="Enter name"><br> 
		<label for="colour">Colour:</label>
			<select name="colour">
				<option value="red">Red</option>
				<option value="black">Black</option>
				<option value="white">White</option>
				<option value="pink">Pink</option>
				<option value="yellow">Yellow</option>
				<option value="blue">Blue</option>
			</select><br> 
			<label for="category">Category:</label> 
			<select name="category">
				<option value="mens">Mens</option>
				<option value="womens">Womens</option>
				<option value="kids">Kids</option>
			</select> <br> <label for="price">Price:</label> <input type="number"
				name="price" placeholder="Enter price"><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>
		<h2>All Products in Store</h2>
		<h3>
			<a href="/allproduct">Link to access all products</a>
		</h3>
		<h2>Search product by name</h2>
		<form action="/nameproduct" method="post">
			<label for="name">Name:</label> <input type="text" name="name"
				placeholder="Enter name to search for"><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>


		<h2>Search product by colour</h2>
		<form action="/colourproduct" method="post">
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
		<h2>Search product by category</h2>
		<form action="/categoryproduct" method="post">
			<label for="category">Category:</label> <select name="category">
				<option value="mens">Mens</option>
				<option value="womens">Womens</option>
				<option value="kids">Kids</option>
			</select><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>
		<h2>Search product by price</h2>
		<form action="/priceproduct" method="post">
			<label for="price">Price:</label> <input type="number" name="price"
				placeholder="Enter price to search for"><br>
			<button type="submit" class="csub">Submit</button>
			<button type="reset" class="creset">Reset</button>
		</form>
	</div>
	</div></div></div>
</body>
</html>