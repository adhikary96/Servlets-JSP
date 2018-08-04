package com.cg.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Logout() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		if(session != null){
			session.setAttribute("username", null);
			session.invalidate();
			response.getWriter().print("<h1>Logged out Successfully!!</h1>");
			request.getRequestDispatcher("/Login.jsp").include(request, response);
			
		}
		else{
			response.getWriter().print("<br/><h3>Login Again!!</h3><br/><hr/>");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
	}

}
