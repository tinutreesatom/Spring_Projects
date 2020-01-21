<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	Registeration page
	<div class="container">
	<form action="login">
		<h1>Registration</h1>
		<table width="25%" align="center">
			<tr><td align="center" class="labels">Name</td>
			<td align="center"><input type="text" name="nametxt"></td></tr>
			<tr><td align="center" class="labels">Address</td>
			<td align="center"><textarea rows="4" cols="15" name="addressTxt"></textarea></td></tr>
			<tr><td align="center" class="labels" >Email</td>
			<td align="center" ><input type="text" name="emailTxt"></td></tr>
			<tr><td align="center" class="labels">Contact No</td>
			<td align="center"><input type="text" name="phnoTxt"></td></tr>
			<tr><td align="center" class="labels">Username</td>
			<td align="center"><input type="text" name="uname"></td></tr>
			<tr><td align="center" class="labels">Password</td>
			<td align="center" ><input type="password" name="pass"></td></tr>
			<tr><td align="center" class="labels">Confirm Password</td>
			<td align="center" ><input type="password" name="cpass"></td></tr>
			<tr><td colspan="2" align="center"><input type="submit" value="Register"></td></tr>
		</table>
		</form>
	</div>
</body>
</html>