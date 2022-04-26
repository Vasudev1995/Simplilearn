<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category products</title>
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
  			<a href="/product">Go back </a>
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
  <h2>Category products are:</h2>
 
  <table id="cus">
  <tr>
  	<th>Id</th>
  	<th>Name</th>
  	<th>Category</th>
  	<th>Price</th>
  <th>Colour</th>
  </tr>
  
  <c:forEach items="${categoryproduct}" var="temp">
  <tr>
  	<td>${temp.id}</td>
  	<td>${temp.name}</td>
  	<td>${temp.category}</td>
  	<td>${temp.price}</td>
  	<td>${temp.colour}</td>
  </tr>
   </c:forEach>
 </table>
 
   </div></div></div>
</body>
</html>