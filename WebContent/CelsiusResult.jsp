<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Celsius Results</title>
</head>
<body>
	<p>${userTemperatureCollector.getFahrenheit()} F (Fahrenheit) converts to:
		${userTemperatureCollector.getCelsius()} C (Celsius)</p>
	<a href="temperatureConverter.jsp">Click to convert another temperature.</a>
	<br />
	<a href="index.jsp">Click to convert a distance.</a>
</body>
</html>