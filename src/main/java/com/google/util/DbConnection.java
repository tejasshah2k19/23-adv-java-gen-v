package com.google.util;

import java.sql.*;

public class DbConnection {

	public static void main(String[] args) {

		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/23advgenh";
		String userName = "root";
		String password = "root";

		try {
			// load driver
			Class.forName(driverName);

			// open db connection
			Connection con = DriverManager.getConnection(url, userName, password);
			System.out.println("DbConnected");
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
