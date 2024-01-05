package com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DbConnection {

	void getConnection() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advjava23";
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

	void addUser() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advjava23";
		String userName = "root";
		String password = "root";

		try {
			// load driver
			Class.forName(driverName);

			// open db connection
			Connection con = DriverManager.getConnection(url, userName, password);

			// query -> PreparedStatement*** ,Statement, CallableStatement

			// PreparedStatement
			Scanner scr = new Scanner(System.in);

			System.out.println("Enter name email and password  ");
			String name = scr.next();
			String email = scr.next();
			String password2 = scr.next();

			PreparedStatement pstmt = con
					.prepareStatement("insert into users (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, password2);

			int record = pstmt.executeUpdate();// insert { update delete }

			if (record == 1) {
				System.out.println("Record added");
			} else {
				System.out.println("Insertion Fail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void listUser() {
		// select * from users -> db record -.

		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advjava23";
		String userName = "root";
		String password = "root";

		try {
			// load driver
			Class.forName(driverName);

			// open db connection
			Connection con = DriverManager.getConnection(url, userName, password);

			// query
			PreparedStatement stmt = con.prepareStatement("select * from users");
			ResultSet rs = stmt.executeQuery(); // select

			while (rs.next()) { //true false 

				int userId = rs.getInt("userId");
				String firstName = rs.getString("firstName");
				String email = rs.getString("email");
				String pwd = rs.getString("password");

				System.out.println(userId + " " + firstName + " " + email + " " + password);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DbConnection d = new DbConnection();
//		d.addUser();
		d.listUser();
	}
}
