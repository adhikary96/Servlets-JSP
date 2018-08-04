package com.cg.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookies
 */
@WebServlet("/GetCookies")
public class GetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public GetCookies() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie cookie[] = request.getCookies();
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		for (Cookie c : cookie) {
			out.print("<hr/>");
			out.print(c.getName()+ " : "+c.getValue() + ": " +c.getMaxAge() + " : "+c.getDomain());
		}
		out.print("</html></body>");
	}

}
