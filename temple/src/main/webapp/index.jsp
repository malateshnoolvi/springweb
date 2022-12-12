<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temple</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="text-align: left;font-size: larger; background-repeat:no-repeat; background-size:100%; background-image: url('https://img.traveltriangle.com/blog/wp-content/uploads/2020/01/temples-in-India_8th-jan.jpg');">	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#"> <img alt="metro"
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCFutJtplt7bnElx7a0AtW6BEmXcbYVq7KcA&usqp=CAU"
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
	
	<form action="save" method="post"" style="font-weight: bolder;font-size: large;font-style: inherit;">
	
	<h1>TEMPLE INFORMATION</h1>
	<p>
		<a href="#" class="text-success">${message}</a>
	</p>
	<p>
		<a href="#" class="text-danger">${error}</a>
	</p>
	<pre>
		NAME   <input type="text" name="name"/>
		
	        LOCATION  <select name="location">
		    <option>BTM</option>
		    <option>Banashankari</option>
		    <option>Jayanagar</option>
		    <option>Vijayanagar</option>
		    </select>
		    
		MAINGOD    <select name="mainGod">
			<option>Ajaneya</option>
			<option>SaiBaba</option>
			<option>RaghavendraSwami</option>
			<option>Krishna</option>
		    </select>
		    
		PINCODE  <select name="pincode">
			<option>540032</option>
			<option>560064</option>
			<option>560021</option>
			<option>560043</option>
		</select><br>
		
		FEES     <input type="number" name="fees"/>
		
		OPENTIME <input type="text" name="openingTime">
		
		CLOSETIME<input type="text" name="closingTime">
		
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