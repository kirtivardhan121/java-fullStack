
<%
	String s = (String)request.getAttribute("msg");
%>


<html>
<body>
<h2 style="color: green;">${msg}</h2>
<h2 style="color: red;"><%=s%></h2>

<h3>${name}</h3>
<h3 style="color: red;">${id}</h3>
</body>
</html>
