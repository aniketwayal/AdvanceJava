package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		String uname= request.getParameter("uname");
		String pass= request.getParameter("pass");
		
		if(pass.equals("xyz")) {
			out.println("Welcome to webiste........");
			out.println("hello.."+uname);
			
			Cookie c = new Cookie("uname", uname);
			response.addCookie(c);
		}
		else
		{
			out.println("Sorry username or password didnt match.. Try again.");
			request.getRequestDispatcher("login.html").include(request, response);
		}
	}

}
