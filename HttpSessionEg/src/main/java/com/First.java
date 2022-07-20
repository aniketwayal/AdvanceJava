package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			PrintWriter out = response.getWriter();
			String u = request.getParameter("uname");
			out.print("Hello...." + u);
			
			HttpSession ses = request.getSession();
			ses.setAttribute("uname", u);
			
			out.println("<a href='servlet2'> Product </a>");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
