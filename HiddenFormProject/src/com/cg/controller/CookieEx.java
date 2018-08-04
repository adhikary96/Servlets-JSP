package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CookieEx")
public class CookieEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public CookieEx() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie cookie1 = new Cookie("Ck1", "Cookies 1....");
		cookie1.setMaxAge(5000);
		response.addCookie(cookie1);
		
		Cookie cookie2 = new Cookie("ck2", "Cookies 2....");
		cookie2.setMaxAge(5000);
		response.addCookie(cookie2);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
