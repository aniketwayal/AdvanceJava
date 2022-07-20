package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestDispatcherEg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public RequestDispatcherEg() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String uname= req.getParameter("uname");
		String pass= req.getParameter("pass");
		
		if(pass.equals("xyz")) {
			RequestDispatcher rd = req.getRequestDispatcher("servlet2");
			rd.forward(req, response);
		}
		else
		{
			out.println("Sorry username or password didnt match.. Try again.");
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, response);
		}
	}

}
