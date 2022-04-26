<%@page import="com.simplilearn.entity.Register"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Users by email</title>
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
  		<li>
  			<a href="/user">Go back</a>
  		</li>
  		</ul>
  	</nav>
  </header>
  <div class="main">
  <div class="sec1">
  <h2>Your search result:</h2>
  <table id="cus">
  <tr>
  	<th>Id</th>
  	<th>Name</th>
  	<th>Gender</th>
  	<th>Email id</th>
  
  </tr>

  <tr>
  	<td>${id}</td>
  	<td>${name}</td>
  	<td>${gender}</td>
  	<td>${email}</td>
  	
  </tr>
 
   
 </table>
 </div></div></div>
</body>
</html>