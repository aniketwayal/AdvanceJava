package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		ServletContext cfg = getServletContext();  //one object for entire project
//		String d = cfg.getInitParameter("mysqldriver");
//		out.println(d);
		
		Enumeration<String> e = cfg.getInitParameterNames();
		
		String s ="";
		while (e.hasMoreElements()) {
			s= e.nextElement();
			out.println("<br>" + cfg.getInitParameter(s));
		}
	}

}
