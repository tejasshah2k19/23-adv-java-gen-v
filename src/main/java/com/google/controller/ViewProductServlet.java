package com.google.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewProductServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// file->new->servlet

		Integer productId = Integer.parseInt(request.getParameter("productId"));

		// select * from products where productId = 12 ;

		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/advjava23";
			String userName = "root";
			String password = "root";

			Class.forName(driverName);

			Connection con = DriverManager.getConnection(url, userName, password);

			PreparedStatement pstmt = con.prepareStatement("select * from products where productId = ? ");
			pstmt.setInt(1, productId);

			ResultSet rs = pstmt.executeQuery();

			request.setAttribute("rs", rs);
			
			request.getRequestDispatcher("ProductInfo.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
