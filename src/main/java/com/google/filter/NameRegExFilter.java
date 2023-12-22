package com.google.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/NameServlet")
public class NameRegExFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String userName = request.getParameter("userName");
		String alpha = "[a-zA-Z]+";
	
		
		if(userName.matches(alpha) == false) {
			//error 
			request.setAttribute("nameError","Please Enter Valid Name");
			RequestDispatcher rd = request.getRequestDispatcher("Name.jsp");
			rd.forward(request,response);
		}else {
			//go Ahead 
			chain.doFilter(request,response);//filter3 , Servlet
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
