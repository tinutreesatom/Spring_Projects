<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<div class="container">
		<h1>welcome:<%=request.getAttribute("name") %></h1>
	</div>
</body>
</html>