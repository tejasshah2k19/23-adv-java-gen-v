<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	ResultSet rs = (ResultSet) request.getAttribute("rs");
	%>
	<table border="1">
		<tr>
			<th>ProductId</th>
			<th>Name</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<%
		while (rs.next()) {//1st 
			String name = rs.getString("name");
			int price = rs.getInt("price");
			int productId = rs.getInt("productId"); 
		%>
		<tr>
		<td><%=productId %></td>
			<td><%=name%></td>
			<td><%=price%></td>
			<td>
			
				<a href="DeleteProductServlet?productId=<%=productId%>">Delete</a>
				<a href="ViewProductServlet?productId=<%=productId%>">View</a>
			
			
			</td>
		</tr>
		<%
		}
		%>

	</table>


</body>
</html>