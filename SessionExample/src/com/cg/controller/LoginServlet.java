package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("user").trim().equals("admin")
				&&request.getParameter("password").trim().equals("admin")){
			HttpSession session = request.getSession();
			session.setAttribute("username", request.getParameter("user"));
			request.getRequestDispatcher("Inbox").include(request, response);
		}
		else{
			response.getWriter().print("<br/><h3>Please enter a valid user name and Password.</h3><br/><hr/>");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
		
	}

}
