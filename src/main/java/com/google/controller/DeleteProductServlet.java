package com.google.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));

		try {

			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/advjava23";
			String userName = "root";
			String password = "root";

			Class.forName(driverName);

			Connection con = DriverManager.getConnection(url, userName, password);

			PreparedStatement pstmt = con.prepareStatement("delete from products where productId = ? ");
			pstmt.setInt(1, productId);

			int record = pstmt.executeUpdate();

			if (record == 0) {
				System.out.println("SMW");
			} else {
				System.out.println(record + " record deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("ListProductServlet");
		rd.forward(request, response);

	}
}
