<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>

<body>


	<%
		Enumeration<String> requestHeaders = (Enumeration<String>)request.getAttribute("requestHeaders");
	%>
	
	
	<%
		while(requestHeaders.hasMoreElements()){
			String name = requestHeaders.nextElement();	
			out.print(name+" :: "+ request.getHeader(name)  +"<br><br><br>");
		}
	%>
	

</body>
</html>