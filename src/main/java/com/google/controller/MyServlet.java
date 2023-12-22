package com.google.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet{

	public void init() {
		System.out.println("MyServlet::init()");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("MyServlet::service()");
	}
	
	public void destroy() {
		System.out.println("MyServlet::destroy()");
	}
}
