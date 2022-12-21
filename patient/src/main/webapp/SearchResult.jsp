<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>PatientSearch</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
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
				<li class="nav-item"><a class="btn btn-primary"
						aria-current="page" href="index.jsp">HOME</a></li>
				</ul>
				
			</div>
		</div>
	</nav>
<p style="text-align: center;color: green;">${message}</p>
<table class="table table-striped table dark">
<thead>
<tr style="color: black;font-size: larger;">
    <th scope="col" >Name</th>
      <th scope="col">Email</th>
      <th scope="col">Age</th>
      <th scope="col">MobileNo</th>
      <th scope="col">Gender</th>
      <th scope="col">Id-Proof</th>
      <th scope="col">Id-value</th>
      <th scope="col">BPLcard</th>
      <th scope="col">Insurance</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="dto">
<tr>
       <td>${dto.name}</td>
       <td>${dto.email}</td>
       <td>${dto.age}</td>
       <td>${dto.mobileNo}</td>
       <td>${dto.gender}</td>
       <td>${dto.idProof}</td>
       <td>${dto.idValue}</td>
       <td>${dto.cardBPL}</td>
       <td>${dto.insurance}</td>
</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>