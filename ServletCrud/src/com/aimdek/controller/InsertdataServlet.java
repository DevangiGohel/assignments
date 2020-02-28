package com.aimdek.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aimdek.model.model;
import com.aimdek.persistance.implementationDAO;

@WebServlet("/InsertdataServlet")
public class InsertdataServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response){
    	try {
    		 	response.setContentType("text/html");  
    	        PrintWriter pw=response.getWriter();  
    	        
    	        
    	        int id=Integer.valueOf(request.getParameter("id"));	
    	        String name=request.getParameter("name");
    	        int age=Integer.valueOf(request.getParameter("age"));	
    	      
    	        model m=new model();  
    	        m.setId(id);
    	        m.setName(name);  
    	        m.setAge(age);  
    	          
    	        int result=implementationDAO.insert(m);  
    	        if(result>0){
    	        	
    	            pw.print("<h1><center><p>Record inserted successfully!</p></center></h1>"); 
    	            request.getRequestDispatcher("index.html").include(request, response);  
    	           // RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
    	           // requestDispatcher.forward(request, response);
    	        }
    	        else{  
    	            pw.println("Sorry..try again");  
    	        }  
    	          
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    		}
    	}
       
  
}  