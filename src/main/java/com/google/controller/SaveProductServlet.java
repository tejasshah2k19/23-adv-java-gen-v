package com.google.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveProductServlet")
public class SaveProductServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("name");
		String category = request.getParameter("category");
		Integer price = Integer.parseInt(request.getParameter("price"));
		Integer qty = Integer.parseInt(request.getParameter("qty"));

		try {
			String driverName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/advjava23";
			String userName = "root";
			String password = "root";
			Class.forName(driverName);

			Connection con = DriverManager.getConnection(url, userName, password);

			PreparedStatement pstmt = con
					.prepareStatement("insert into products (name,category,price,qty) values (?,?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, category);
			pstmt.setInt(3, price);
			pstmt.setInt(4, qty);

			int record = pstmt.executeUpdate();

			if (record == 0) {
				System.out.println("SMW");
			} else {
				System.out.println("product Added");
			}

			RequestDispatcher rd = request.getRequestDispatcher("AddProduct.jsp");
			rd.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
