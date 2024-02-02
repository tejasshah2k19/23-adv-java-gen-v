<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	Cookie c[] = request.getCookies();

	for (Cookie x : c) {
		out.print(x.getName() + "::" + x.getValue() + "<bR><br>");
	}
	%>
	<br>
	<br>
	<a href="InputCookieData.jsp">Add New Cookie</a>




</body>
</html>