<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save" method="post" style="font-size: larger; border-top-color: aqua;background-color: gray;text-align:justify;text-align: center;">
	
	<h1>TEMPLE INFORMATION</h1>
	<p>
		<a href="#" class="text-success">${message}</a>
	</p>
	<p>
		<a href="#" class="text-danger">${error}</a>
	</p>
	<pre>
		Name<input type="text" name="name"/><br>
		
	    Location<select name="location">
		    <option>BTM</option>
		    <option>Banashankari</option>
		    <option>Jayanagar</option>
		    <option>Vijayanagar</option>
		    </select><br>
		    
		MainGod<select name="mainGod">
			<option>Ajaneya</option>
			<option>SaiBaba</option>
			<option>RaghavendraSwami</option>
			<option>Krishna</option>
		    </select><br>
		    
		Pincode<select name="pincode">
			<option>540032</option>
			<option>560064</option>
			<option>560021</option>
			<option>560043</option>
		</select><br>
		
		Fees<input type="number" name="fees"/><br>
		
		OpenTime<input type="time" name="openingTime"><br>
		
		CloseTime<input type="time" name="closingTime"><br>
		
		<input type="submit" value="save">
		
		</pre>
	</form>
</body>
</html>