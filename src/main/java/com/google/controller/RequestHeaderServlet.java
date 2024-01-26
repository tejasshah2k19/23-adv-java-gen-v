package com.google.controller;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHeaderServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		//read -> headers -> request headers 
		
	 Enumeration<String> requestHeaders = request.getHeaderNames();
	
	 request.setAttribute("requestHeaders",requestHeaders);
	 
	 RequestDispatcher rd = request.getRequestDispatcher("RequestHeaders.jsp");
	 rd.forward(request, response);
	 
	
	}

}
