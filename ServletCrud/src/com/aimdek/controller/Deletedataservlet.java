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

@WebServlet("/Deletedataservlet")
public class Deletedataservlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response){
    	try {
    		 	response.setContentType("text/html");  
    	        PrintWriter pw=response.getWriter();  
    	        
    	        int id=Integer.valueOf(request.getParameter("id"));	
    	       
    	        implementationDAO.delete(id);
    	        
    	        pw.print("<h1><center><p>Record deleted successfully!</p></center></h1>"); 
//	            request.getRequestDispatcher("index.html").include(request, response);  
    	        
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    		}
    	}

}
