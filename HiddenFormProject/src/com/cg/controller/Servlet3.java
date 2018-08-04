package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Servlet3() {
        
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
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		
		response.getWriter().print("<html><head>"
				+ "<title>Result Page</title></head>"
					+ "<body><center><h2>"
					+ "First Name:"+fname+"<br/>"
					+ "Last Name:"+lname+"<br/>"
					+ "Mobile no.:"+mobile+"<br/>"
					+ "Email ID:"+email+"<br/>"
					+ "Gender:"+gender+"<br/>"
					+ "Counntry:"+country+"<br/>"
					+ "state:"+state+"<br/>"
					+ "</h2></center></body>"
				+ "</html>");
		
		System.out.println(fname+" : "+lname+" : "+mobile+" : "+email+" : "+gender+" : "+country+" : "+state);
	}

}
