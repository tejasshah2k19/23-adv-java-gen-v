package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response)
	throws IOException,ServletException{
		//read data -- jsp Registration form 
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String aboutme = request.getParameter("aboutme");
		
		 
		String alphaRegEx = "[a-zA-Z]+";//a to z A to Z 
		
		String emailRegEx = "[a-zA-Z]+@[a-zA-Z]+\\.[a-ZA-Z]{2,5}"; //XXX@XX.XX
		boolean isError = false; //no error
		
		if(firstName == null || firstName.trim().length() == 0 ) {
			isError = true; 
			request.setAttribute("firstNameError","Please Enter FirstName");
		}else if(firstName.matches(alphaRegEx) == false) {
			isError =true; 
			request.setAttribute("firstNameError","Please Enter Valid FirstName");
			request.setAttribute("firstNameValue",firstName);
		
		}
		else {
			request.setAttribute("firstNameValue",firstName);
		}

		if(email == null || email.trim().length() == 0) {
			isError = true; 
			request.setAttribute("emailError","Please Enter Email");
		}else {
			request.setAttribute("emailValue",email);
		}
		
		if(password == null || password.trim().length() == 0) {
			isError = true; 
			request.setAttribute("passwordError","Please Enter Password");
		}
		
		if(gender == null) {
			isError = true; 
			request.setAttribute("genderError","Please Selecte Gender");
		}else {
			request.setAttribute("genderValue",gender);
		}
		
		if(city == null || city.equals("-1")) {
			isError = true; 
			request.setAttribute("cityError","Please Select City");
		}else {
			request.setAttribute("cityValue",city);
		}
		
		if(aboutme == null || aboutme.trim().length() ==0) {
			isError = true; 
			request.setAttribute("aboutmeError","Please Enter Aboutme");
		}else {
			request.setAttribute("aboutmeValue",aboutme);
		}
		
		RequestDispatcher rd = null;
		if(isError == true ) {
			//Registration.jsp
			rd = request.getRequestDispatcher("Registration.jsp");
			
		}else {
			//Home.jsp 
			rd = request.getRequestDispatcher("Home.jsp");
		}
		
		rd.forward(request,response);
		
		
		
	}
}
