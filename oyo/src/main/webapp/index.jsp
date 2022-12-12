<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>oyo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
	
</head>
<body style="text-align: left; border-style: groove; background-color:gray;text-align: left: ;">
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-light">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#"> <img alt="OYO"
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTrV-1ZxKa4FLj8TdQRx_9SzyLqMSzgTR5QrQ&usqp=CAU"
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
					<button class="btn btn-outline-success" type="submit">SEARCH</button>

				</form>
			</div>
		</div>
	</nav>

	<form action="save" method="post"; style="font-weight: bolder; color:white;font-size:x-large;">
	<p>
		<a href="#" class="text-success">${message}</a>
	</p>
	<p>
		<a href="#" class="text-danger">${error}</a>
	</p>
	<pre>
	<h1>  OYOROOM INFORMATION</h1>	
   OWNERNAME:  <input type="text" name="ownerName" />

   ROOMRENT:   <input type="number" name="roomRent" />

   NOOFROOMS:  <input type="number" name="noOfRooms" />

   ROOMAREA:   <input type="text" name="area" />

   ROOMNO:     <input type="number" name="roomNo" />

   MAINTENANCE: <input type="radio" name="maintenance">Yes <input type="radio" name="maintenance">No   
          
   CAMERA:      <input type="radio"  name="camera">Yes <input type="radio"  name="camera">No  
          
   AIRCODITION: <input type="radio" name="airCondition">Yes <input type="radio" name="airCondition">No  
            
   SERVICE:     <input type="radio" name="service">Yes <input type="radio" name="service">Yes                       

          <input type="submit" value="save" class="btn-primary"/>
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