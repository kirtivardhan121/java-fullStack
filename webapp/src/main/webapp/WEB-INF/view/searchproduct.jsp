<%@page import="com.ustglobal.webapp.dto.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="./search" method="post"
		style="margin-left: 450px; margin-top: 100px;">
		<input type="text" name="pname"
			placeholder="enter product id to search">
		<button type="submit" style="color: blue;">search</button>
	</form>

	<%
		ProductBean productBean = (ProductBean) request.getAttribute("productBean");
	%>
	<%
		if (productBean != null) {
	%>
	<table>
		<tr>
			<th>PID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		<tr>
			<td><%=productBean.getOid()%></td>
			<td><%=productBean.getName()%></td>
			<td><%=productBean.getPrice()%></td>
			<td><%=productBean.getQuantity()%></td>
			<td><a href="./buy">buy</a></td>
		</tr>
	</table>

	<%} %>
</body>
</body>
</html>