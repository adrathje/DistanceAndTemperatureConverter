<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>distanceConverter</title>
</head>
<body>
	<h1>~ The Converter Home Page ~</h1>
	<h2>But also the Distance Converter!</h2>
	<form action="getFeetServlet" method="post">
		Meters to feet converter. Enter the number of meters: <input
			type="text" name="userMeters" size="10"> <input type="submit"
			value="Calculate Feet" />
	</form>
	<form action="getMeterServlet" method="post">
		Feet to meters converter. Enter the number of feet: <input type="text"
			name="userFeet" size="10"> <input type="submit"
			value="Calculate Meters" />
	</form>
	<br />
	<a href="temperatureConverter.jsp">Click to convert temperatures.</a>
</body>
</html>