<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient</title>
<h1>Patient Registration Application</h1>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-21xUsEqhTpvVwd7kKB6XC-jyHKmyuz3RIQ&usqp=CAU');background-repeat: no-repeat;text-align: center;background-size: 50%">
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
						<a class="btn btn-primary"
						aria-current="page" href="Search.jsp">Search</a></li>
			
				
			</div>
		</div>
	</nav>

			<p class="text-success" style="font-size: xx-large;font-weight: bolder;">${message}</p>
		
			<p class="text-danger" style="font-size: xx-large;font-weight: bolder;">${error}</p>

	           <h3 style="font-style: inherit;font-style: inherit;font-weight:bolder; color:black;">Please fill the details here</h3>
	<form action="save" method="post" enctype="multipart/form-data" style="text-align:justify,center,justify; font-family: inherit;font-size: larger;font-weight: bolder;">
		
		<pre>
		
                NAME  <input type="text" name="name">
  
                EMAIL <input type="email" name="email" value="${dto.email}">
  
                AGE   <input type="number" name="age">

                MB-NO <input type="number" name="mobileNo" value="${dto.mobileNo}">
  
 GENDER <input type="radio" name="gender" value="male"> male
          <input type="radio" name="gender" value="female"> female
          <input type="radio" name="gender" value="others"> others
  
               ID-PROOF <select name="idProof">
            <option>---select---</option>   
            <option>AdharCard</option>
            <option>RationCard</option>
            <option>DrivingLicense</option>
            <option>PanCard</option>
            <option>VoterId</option>
            </select>  
     
                     ID-VALUE <input type="text" name="idValue">   
  
         BPL-CARD  <input type="radio" name="cardBPL" value="Yes"> Yes <input type="radio" name="cardBPL" value="No"> No
    
         INSURANCE <input type="radio" name="insurance" value="Yes"> Yes <input type="radio" name="insurance" value="No"> No
             
                              FILE <input type="file"  name="file">        
            
            <input type="submit" value="save" class="btn-primary">  
</pre>
	</form>
</body>
</html>