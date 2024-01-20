<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ResultSet rs = (ResultSet)request.getAttribute("rs");
	
		rs.next();//first record 
		
		Integer productId = rs.getInt("productId");
		String name = rs.getString("name");
		Integer price = rs.getInt("price");
		String category = rs.getString("category");
		Integer qty = rs.getInt("qty"); 
		
	%>
	
	ProductId : <%=productId %><Br>
	Name : <%=name %><br>
	Price : <%=price %><br> 
	Category : <%=category %><Br>
	Qty : <%=qty %><br>


</body>
</html>