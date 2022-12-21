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
	style="text-align: left; border-style: groove; background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTW4k5ZNPOB75RBW_rGqKrXqvHawgNlzhi1Xg&usqp=CAU'); background-repeat: no-repeat;background-size: 60%">

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<div class="container-fluid">
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
				aria-controls="navbarTogglerDemo03" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<a class="navbar-brand" href="#"> <img alt="+"
				src="http/patient-logo-template-design-vector-260nw-1638011428.jpg"
				width="100" height="60">
			</a>
			<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="btn btn-primary"
						aria-current="page" href="#">Home</a> <a class="btn btn-primary"
						aria-current="page" href="Search.jsp">Search</a></li>
				</ul>

			</div>
		</div>
	</nav>
	<form action="save" method="post" style="text-align:justify;">
		<pre>
		
  NAME  <input type="text" name="name">
  
  EMAIL <input type="email" name="email">
  
  AGE   <input type="number" name="age">

  MB-NO  <input type="number" name="mobileNo">

  GENDER <input type="radio" name="gender" value="male">male
         <input type="radio" name="gender" value="female">female
         <input type="radio" name="gender" value="others">others
  
  ID-PROOF <select name="idProof">
     <option>AdharCard</option>
     <option>RationCard</option>
     <option>DrivingLicense</option>
     <option>PanCard</option>
     <option>VoterId</option>
     </select>  
     
  ID-VALUE <input type="text" name="idValue">   
  
  BPL-CARD  <input type="radio" name="cardBPL" value="Yes">Yes
            <input type="radio" name="cardBPL" value="No">No
    
  INSURANCE <input type="radio" name="insurance" value="Yes">Yes
            <input type="radio" name="insurance" value="No">No      
            
            <input type="submit" value="save">  
</pre>
	</form>
</body>
</html>