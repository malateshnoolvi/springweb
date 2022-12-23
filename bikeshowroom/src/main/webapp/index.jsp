<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BikeShowRoom</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body
	style="text-align: left; border-style: groove; background-image: url('https://wallpaperaccess.com/full/163134.jpg'); background-repeat: no-repeat; background-size: 100%">

	<nav class="navbar navbar-expand-lg navbar-dark bg-light">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#"> <img alt="BIKE"
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTk1URrVCgf7uMBq9jSgf9DiQAw00gW7fn3HQ&usqp=CAU"
				width="100" height="60">
			</a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="btn btn-primary"
						aria-current="page" href="#">HOME</a>
						<a class="btn btn-primary"
						aria-current="page" href="Search.jsp">Search</a></li>
				</ul>
				
			</div>
		</div>
	</nav>

	<form action="send" method="post" style="font-weight: bolder; color: white; font-size: x-large;">
		<p>
			<a href="#" class="text-success">${message}</a>
		</p>
		<p>
			<a href="#" class="text-danger">${error}</a>
		</p>
		<pre>
	<h1>BIKESHOWROOM INFORMATION</h1>
BRAND       <input type="text" name="brand" value="${dto.brand}" /><br>

OWNERNAME   <input type="text" name="ownerName" value="${dto.ownerName}" /><br>

LOCATION    <input type="text" name="location" value="${dto.location}" /><br>

AMBASSADOR  <input type="text" name="ambassador" value="${dto.ambassador}" /><br>

DESCRIPTION <input type="text" name="description" value="${dto.description}" /><br>

          <input type="submit" value="send" class="btn-primary" />
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
