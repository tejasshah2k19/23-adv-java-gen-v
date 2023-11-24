package com.google.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// read
		String n1 = request.getParameter("n1"); // read n1 "" "20" -> 20
		String n2 = request.getParameter("n2"); // read n2 ""

		// print
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String error = "";
		if (n1 == null || n1.trim().length() == 0) {
			error = "<br>Please Enter No.1";
		}

		if (n2 == null || n2.trim().length() == 0) {
			error = error + "<br>Please Enter No.2";
		}

		if (error.trim().length() == 0) {
			int ans = Integer.parseInt(n1) + Integer.parseInt(n2);

			out.print("<html><body>");
			out.print("<br>No1 : " + n1);
			out.print("<br>No2 : " + n2);
			out.print("<br>Addition : " + ans);
			out.print("</body></html>");

		} else {
			out.print("<html><body>");
			out.print(error);
			out.print("</body></html>");
		}

	}

}
