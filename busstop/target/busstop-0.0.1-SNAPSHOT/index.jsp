<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BusStop</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</style>
</head>
<body style="text-align: center; background-image: url('https://previews.123rf.com/images/rudall30/rudall301205/rudall30120500052/13792509-cartoon-illustration-of-a-bus-stop.jpg');text-shadow: fuchsia;">

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#"> <img alt="metro"
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSIyQIK3ZjPXXww-4txoALnCvi7jbOlIBuFQw&usqp=CAU"
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
	<form action="send" method="post" style="font-weight: bolder;font-size: large;color:scrollbar;">
<p>
		<a href="#" class="text-success">${message}</a>
	</p>
	<p>
		<a href="#" class="text-danger">${error}</a>
	</p>
<pre>
<h1 style="color:menutext;">BUSSTOP INFORMATION</h1>

BUSSTOPNAME   <input type="text" name="name">

LOCATION      <input type="text" name="location">

CAPACITY      <input type="text" name="capacity">

MAINTENANCE   <input type="text" name="maintenance">

NOOFWORKERS   <input type="text" name="noOfWorkers">

NOOFFLATFORMS <input type="text" name="noOfFlatForms">

             <input type="submit" value="send" >
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