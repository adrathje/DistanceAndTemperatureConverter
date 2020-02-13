<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temperature Converter</title>
</head>
<body>
	<h1>Temperature Converter</h1>
	<form action="getCelsiusServlet" method="post">
		Fahrenheit to Celsius converter. Enter the temperature in Fahrenheit:
		<input type="text" name="userFahrenheit" size="10"> <input
			type="submit" value="Calculate Celsius" />
	</form>
	<form action="getFahrenheitServlet" method="post">
		Celsius to Fahrenheit converter. Enter the temperature in Celsius: <input
			type="text" name="userCelsius" size="10"> <input
			type="submit" value="Calculate Fahrenheit" />
	</form>
	<br />
	<a href="temperatureConverter.jsp">Click to convert another
		temperature.</a>
	<br />
	<a href="index.jsp">Click to go back to converting distances.</a>
</body>
</html>