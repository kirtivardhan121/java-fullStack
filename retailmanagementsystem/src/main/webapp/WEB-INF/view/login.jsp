<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<fieldset>
		<legend>Login</legend>
		<form action="./login" method="post">
			<h2>${msg}</h2>
			<h3>Login Here</h3>
			Email:<br> <input type="text" placeholder="Enter Your Email"
				name="email" required="required"><br> Password:<br>
			<input type="text" name="password" placeholder="Enter Your Password"
				required="required"><br>
			<button type="submit">Login</button>
			<button type="reset">Reset</button>
			<br> <a href="./register">Register Here</a>
		</form>
	</fieldset>
</body>
</html>