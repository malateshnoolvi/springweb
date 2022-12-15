<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>chappal</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-image: url('https://media.istockphoto.com/id/1088879938/photo/white-hotel-slippers-on-a-yellow-background-top-view-minimalist-trend.jpg?s=612x612&w=0&k=20&c=Xq7TmCADWEdUquzTDHmXDSH3QbbFc54aLV4spLR8sfk=');background-size: 50%;text-align: left: ;">
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#"> <img alt="SLIPPER"
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSfocRcN1mdDkhU-ZzJHEjXLgpOL9xU2sgh-w&usqp=CAU"
				width="100" height="60">
			</a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="btn btn-primary"
						aria-current="page" href="#">HOME</a></li>
				</ul>
				<form class="d-flex">
					<input class="form-control me-2" type="search" placeholder="Search"
						aria-label="Search">
					<button class="btn btn-outline-success" type="submit">Search</button>

				</form>
			</div>
		</div>
	</nav>
				
	<form action="save" method="post" style="font-size:larger;font-family: fantasy;font-weight: bolder;">
		
		<h1>CHAPPAL INFORMATION</h1>
		<p>
		<a href="#" class="text-success"style="font-size: larger;font: italic;">${message}</a>
	</p>
	<p>
		<a href="#" class="text-danger" style="color: red;font: italic;font-size: larger;">${error}</a>
	</p>
	<pre>
		<pre>
	          BRAND  <input type="text" name="brand" /><br> 
	     
	          PRICE  <input type="number" name="price"><br> 
                 
                  COLOR  <select name="color">
			  <option>Red</option>
			  <option>Black</option>
			  <option>White</option>
			  <option>Brown</option>
			  <option>Gray</option>
		      </select><br>
		      
                  SIZE   <select name="size">
			  <option>6</option>
			  <option>7</option>
			  <option>8</option>
			  <option>9</option>
			  <option>10</option>
		      </select><br>
         
                  GENDER <input type="radio" name="gender" value="male">male
                         <input type="radio" name="gender" value="female">female
                         <input type="radio" name="gender" value="others">others
              
                   <input type="submit" value="save" class="btn-primary">
</pre>
	</form>
	
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
	
</body>
</html>