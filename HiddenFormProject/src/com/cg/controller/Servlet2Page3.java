package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2Page3
 */
@WebServlet("/Servlet2Page3")
public class Servlet2Page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Servlet2Page3() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("first");
		String lname = request.getParameter("last");
		String mobile = request.getParameter("phone");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		
		response.getWriter().print("<html><head>"
				+ "<title>Page 3</title></head>"
				+ "<body>"
				+ "<form action='Servlet3' method='post'>"
				+ "<input type='hidden' name='first' value='"+fname+"'>"
				+ "<input type='hidden' name='last' value='"+lname+"'>"
				+ "<input type='hidden' name='phone' value='"+mobile+"'>"
				+ "<input type='hidden' name='email' value='"+email+"'>"
				+ "<input type='hidden' name='gender' value='"+gender+"'>"
				+ "Country :<input type='text' name='country'><br/>"
				+ "State :<input type='text' name='state'><br/>"
				+ "<button type='submit' name='submit'>Submit</button></form>"
				+ "</body>"
				+ "</html>");
	}

}
