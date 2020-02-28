package com.aimdek.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aimdek.model.model;
import com.aimdek.persistance.implementationDAO;


@WebServlet("/updateServlet")
public class updateServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		try {

	        response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	      
	        int id=Integer.parseInt(request.getParameter("id"));
	         model m=implementationDAO.getbyId(id);
	         out.println("<center>");
	         out.print("<form action='UpdatedataServlet' method='get'>");  
	         out.print("<table>");  
	         out.print("<tr><td>ID :</td><td><input type='text' name='id' value='"+m.getId()+"'/></td></tr>");  
	         out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+m.getName()+"'/></td></tr>");  
	         out.print("<tr><td>Age :</td><td><input type='text' name='age' value='"+m.getAge()+"'/></td></tr>");  
	         out.print("</td></tr><tr><td colspan='2'><input type='submit' value=' Update '/></td></tr>");  
	         out.print("</table></form>");
	         out.println("<center>");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
