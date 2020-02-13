<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feet Results</title>
</head>
<body>
	<p>${userDistanceCollector.getMeters()} meters convert to:
		${userDistanceCollector.getFeet()} feet</p>
	<a href="index.jsp">Click to convert a distance again.</a> <br />
	<a href="temperatureConverter.jsp">Click to convert temperatures.</a>
</body>
</html>