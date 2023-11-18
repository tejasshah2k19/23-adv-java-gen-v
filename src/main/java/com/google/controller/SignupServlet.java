package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ctrl+shift+O 

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("SignupServlet called....");

		// read
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		System.out.println("firstName => " + firstName);
		System.out.println("email => " + email);
		System.out.println("password => " + password);

		// send response to the client -- browser
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		out.print("<html><body>");
		out.println("<br>firstName => " + firstName);
		out.println("<br>email => " + email);
		out.println("<br>password => " + password);
		out.print("</body></html>");

	}
}

//1: tomcat server 
//2: google  