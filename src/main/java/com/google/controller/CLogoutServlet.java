package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CLogoutServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	

		//login -> cookie -> remove 
		//cookie - 1 year  
		
		//logout -> 
		//cookie -> 3 days 
		
		Cookie c = new Cookie("login","yes");
		c.setMaxAge(0);
		response.addCookie(c);
		
		
		//login 
		response.sendRedirect("CLogin.jsp");
		
	}

}
