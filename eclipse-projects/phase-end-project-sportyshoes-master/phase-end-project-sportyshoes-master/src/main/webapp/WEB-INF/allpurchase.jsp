<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All reports</title>
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
  		<li>
  		<a href="/purchase">Go back</a>
  		</li>
  		</ul>
  	</nav>
  </header>
  <div class="main">
  	<div class="sec1">
  <h2>All reports are:</h2>
 
  <table id="cus">
  <tr>
  	<th>Purchase Id</th>
  	<th>Date</th>
  	<th>Type</th>
  	<th>Product id</th>
  
  </tr>
  
  <c:forEach items="${purchase}" var="temp">
  <tr>
  	<td>${temp.id}</td>
  	<td>${temp.date}</td>
  	<td>${temp.type}</td>
  	<td>${temp.product_id}</td>
  	
  </tr>
   </c:forEach>
 </table>  
 </div></div></div>
</body>
</html>