<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body
	style="text-align: left; border-style: groove; background-image: url(''); background-repeat: no-repeat; background-size: 100%">

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#"> <img alt="logo"
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQNoB2AgSTYCsfL4A2lJbW4OvTXfz0infrNQ&usqp=CAU"
				width="100" height="60">
			</a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="btn btn-primary"
						aria-current="page" href="index.jsp">HOME</a></li>
				</ul>
			</div>
		</div>
	</nav>
<form action="save" method="get" style=" font-weight:bolder; font-size: larger;font: larger;text-align:left;">
         <pre>
                     <h5>Search Here</h5>
                     
					PatientName  <input type="text" class="name" name="name"/> <br>	
				      GreaterThanAge <input type="text" class="name" name="greaterThanAge" value="0"/> <br> 	
				       LesserThanAge <input type="text" class="name" name="lesserThanAge" value="0"/> <br>
					
					             <input type="submit" value="Search" class="btn-primary" /><br>
				
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