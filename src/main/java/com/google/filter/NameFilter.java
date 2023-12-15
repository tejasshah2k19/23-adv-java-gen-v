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
public class NameFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("NameFilter::doFilter()");

		String userName = request.getParameter("userName");
		if (userName == null || userName.trim().length() == 0) {
			// back
			
			request.setAttribute("nameError","Please Enter Name"); 
			RequestDispatcher rd = request.getRequestDispatcher("Name.jsp");
			rd.forward(request,response);
			
		} else {

			// goAhead
			chain.doFilter(request, response);// servlet , filter2 , filter3 , Servlet
		}

	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
