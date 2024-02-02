package com.google.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		
		if(email.equals("rock@gmail.com") && password.equals("rock123")) {
			//correct 
			
			Cookie c = new Cookie("login", "yes");
			response.addCookie(c);
			
			
			request.getRequestDispatcher("CHome.jsp").forward(request, response);
		}else {
			//incorrect
			request.setAttribute("error", "Invalid Credentials");
			request.getRequestDispatcher("CLogin.jsp").forward(request, response);
		}
	
	}

}
