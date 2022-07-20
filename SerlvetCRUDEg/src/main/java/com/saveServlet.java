package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/saveServlet")
public class saveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setUsername(email);
		emp.setPassword(password);
		
		int status = EmpDao.save(emp);
		
		if(status>0) {
			out.println("record save");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else {
			out.println("Sorry......");
		}
	}

}
