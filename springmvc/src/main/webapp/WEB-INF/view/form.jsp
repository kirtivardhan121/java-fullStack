<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./form" method="post">
			<input type="text" name="name" value="Name" /><br /> 
			<input type="text" name="email" value="Email ID"/><br /> 
			<input type="password" name="password" value="Password"/><br /> 
			<input type="text" name="gender" value="gender"/><br/>
			<input type="date" name="doj"/><br/>
			<input type="reset" value="reset"/>
			<input type="submit" value="register" />
	</form>
</body>
</html>