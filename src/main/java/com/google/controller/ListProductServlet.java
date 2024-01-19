package com.google.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ListProductServlet")
public class ListProductServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {

		// open db connection
		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/advjava23";
			String userName = "root";
			String password = "root";

			Class.forName(driverName);

			Connection con = DriverManager.getConnection(url, userName, password);

			// query run -> PreparedStatement

			PreparedStatement pstmt = con.prepareStatement("select * from products");
			ResultSet rs = pstmt.executeQuery();
			
			request.setAttribute("rs", rs);
			
			RequestDispatcher rd = request.getRequestDispatcher("ListProduct.jsp");
			rd.forward(request, response);
			
			
		} catch (Exception e) {

		}

		//

	}
}
