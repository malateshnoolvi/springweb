<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<body>
<p style="text-align: center;color: green;">${message}</p>
<table class="table table-striped table dark">
<thead>
    <tr>
      <th scope="col" style="color: black;font-size: larger;">Brand</th>
      <th scope="col">OwnerName</th>
      <th scope="col">Location</th>
      <th scope="col">Ambassador</th>
      <th scope="col">Description</th>   
    </tr>  
</thead>
<tbody>
<c:forEach items="${list}" var="dto">
       <tr>
          <td>${dto.brand}</td>    
          <td>${dto.ownerName}</td>
          <td>${dto.location}</td>
          <td>${dto.ambassador}</td>
          <td>${dto.description}</td>       
             </tr>
</c:forEach>
   </tbody>

</table>
</body>
</html>