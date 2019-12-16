<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	Registration page
	<div class="container">
	<form action="registerProcess" method="post">
		<h1>Registration</h1>
		<table width="25%" align="center">
			<tr><td align="center" class="labels">First Name</td>
			<td align="center"><input type="text" name="firstname" id="firstname"></td></tr>
			<tr><td align="center" class="labels">Last Name</td>
			<td align="center"><input type="text" name="lastname" id="lastname"></td></tr>
			<tr><td align="center" class="labels">Address</td>
			<td align="center"><textarea rows="4" cols="15" name="address" id="address"></textarea></td></tr>
			<tr><td align="center" class="labels" >Email</td>
			<td align="center" ><input type="text" name="email" id="email"></td></tr>
			<tr><td align="center" class="labels">Contact No</td>
			<td align="center"><input type="text" name="phone" id="phno"></td></tr>
			<tr><td align="center" class="labels">Username</td>
			<td align="center"><input type="text" name="username" id="username"></td></tr>
			<tr><td align="center" class="labels">Password</td>
			<td align="center" ><input type="password" name="password" id="password"></td></tr>
			<tr><td colspan="2" align="center"><input type="submit" value="Register"></td></tr>
		</table>
		</form>
	</div>
</body>
</html>