package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String firstName = request.getParameter("firstName");
		String dob = request.getParameter("dob");
		String gender = request.getParameter("gender");

		// goto OutputData.jsp
		// how to navigate from servlet to jsp?
		RequestDispatcher rd = request.getRequestDispatcher("OutputData.jsp");// where ?
		// send it
		rd.forward(request, response); // navigate

	}
}
