package com.google.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cName = request.getParameter("cName");
		String cValue = request.getParameter("cValue");

		
		Cookie c = new Cookie(cName, cValue);
		
		response.addCookie(c);
		

		request.getRequestDispatcher("InputCookieData.jsp").forward(request, response);
	}

}
