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
		
		boolean isError = false; //no error
		if(firstName == null || firstName.trim().length() == 0 ) {
			isError = true; 
			request.setAttribute("firstNameError","Please Enter FirstName");
		}

		if(email == null || email.trim().length() == 0) {
			isError = true; 
			request.setAttribute("emailError","Please Enter Email");
		}
		
		if(password == null || password.trim().length() == 0) {
			isError = true; 
			request.setAttribute("passwordError","Please Enter Password");
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
