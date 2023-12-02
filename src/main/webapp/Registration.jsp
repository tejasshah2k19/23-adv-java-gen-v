<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>

	<form action="RegistrationServlet" method="post">
		FirstName : <input type="text" name="firstName" value="${firstNameValue}"/>
		<font color="red">${firstNameError}</font>
		<br><BR>
		Email :  <input type="text" name="email" value="${emailValue}"/>
		<font color="red">${emailError}</font>
		<br><br> 
		Password : <input type="password" name="password"/>
		<font color="red">${passwordError}</font>
		<br><Br> 
		
		
		Gender:    Male:<input type="radio" value="male" name="gender" />
				    Female: <input type="radio" value="female" name="gender"/> 
				    <font color="red">${genderError }</font>
		<br><Br> 
		
		
		City : <select name="city">
					<option value="-1">-----Select City-----</option>
					<option value="ahmedabad">Ahmedabad</option>
					<option value="baroda">Baroda</option>
					<option value="surat">Surat</option>
			  </select>
			  <font color="red">${cityError }</font>
			<br><Br>
			
		About YourSelf : <textarea rows="6" cols="25"  name="aboutme">
							${aboutmeValue }
						</textarea>		    
			<font color="red">${aboutmeError }</font>
			<bR><br>
		<input type="submit" value="Signup"/> 
	
	</form>

</body>
</html>