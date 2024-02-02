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

	if (c != null)
		for (Cookie x : c) {
			if (x.getName().equals("login")) {
		//already loggedin 
		response.sendRedirect("CHome.jsp");
			}
		}
	%>


	<form action="CLoginServlet" method="post">
		Email : <input type="text" name="email" /><br> <br>
		Password : <input type="password" name="password" /><br> <br>
		<input type="submit" value="Login" />

	</form>
	<br> ${error}
</body>
</html>