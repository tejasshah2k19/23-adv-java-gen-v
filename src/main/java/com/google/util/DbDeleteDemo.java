package com.google.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DbDeleteDemo {
	public static void main(String[] args) {

		// delete query

		// sql -> users

		// db connection
		String driveName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/advjava23";
		String userName = "root";
		String password = "root";

		try {
			Class.forName(driveName);// driver load
			Connection con = DriverManager.getConnection(url, userName, password);// open

			Scanner scr = new Scanner(System.in);
			System.out.println("Enter userId : Delete ");
			int userId = scr.nextInt();
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement("delete from users where userId = ?");
			pstmt.setInt(1, userId);

			//run query 
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
