package com.cg.controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Inbox")
public class Inbox extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Inbox() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession(false);
		if(session != null){
			response.getWriter().print("<html><body>"
					+ "<div>"
						+ "<div><h1>Welcome <b><i>"+session.getAttribute("username")
						+ "</i></b>!!"
						+ "Login Time:"+LocalDateTime.now()
						+ "<br></h1></div>"
							+ "<div><form action='SentItems' method='post'>"
						+ "<input type='submit' value='Sent Items'></form></div>"
							+ "<div><form action='Logout' method='post'>"
						+ "<input type='submit' value='Logout'></form></div>"
					+ "</div>"
					+ "</body></html>");
		}
		else{
			response.getWriter().print("<br/><h3>Login Again!!</h3><br/><hr/>");
			request.getRequestDispatcher("Login.jsp").include(request, response);
		}
		
	}

}
