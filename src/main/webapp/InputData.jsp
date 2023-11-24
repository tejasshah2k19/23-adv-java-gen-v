<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

<form action="DataServlet" method="post">
	FirstName : <input type="text" name="firstName"/><br><br>  
	DOB :  <input type="text" name="dob"/><Br><Br> 
	Gender : 
		Male:<input type="radio" name="gender" value="male">
		Female:<input type="radio" name="gender" value="female"/> <br><br>
		<input type="submit" value="Signup"/> 
</form>
</body>
</html>