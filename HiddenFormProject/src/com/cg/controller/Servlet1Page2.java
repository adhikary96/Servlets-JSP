package com.cg.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1Page2
 */
@WebServlet("/Servlet1Page2")
public class Servlet1Page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet1Page2() {
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);		

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = request.getParameter("first");
		String lname = request.getParameter("last");
		String mobile = request.getParameter("phone");
		response.getWriter().print("<html><head>"
				+ "<title>Page 2</title></head>"
				+ "<body>"
				+ "<form action='Servlet2Page3' method='post'>"
				+ "<input type='hidden' name='first' value='"+fname+"'>"
				+ "<input type='hidden' name='last' value='"+lname+"'>"
				+ "<input type='hidden' name='phone' value='"+mobile+"'>"
				+ "Email :<input type='text' name='email'><br/>"
				+ "Gender :<input type='text' name='gender'><br/>"
				+ "<input type='submit' value='Continue'></form>"
				+ "</body>"
				+ "</html>");

	}

}
