<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<form action="SaveProductServlet" method="post">
		Name : <input type="text" name="name"/><br><Br>  
		Price :<input type="text" name="price"/><Br><br> 
		Category : <input type="text" name="category"/><br><Br> 
		Qty : <input type="text" name="qty"/><br><br> 
		
		<input type="submit" value="Save Product"/>
	
	</form>
</body>
</html>