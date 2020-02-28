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

@WebServlet("/UpdatedataServlet")
public class UpdatedataServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){
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
    	        
    	        
    	        
    	        int result=implementationDAO.update(m);
    	        
    	        if(result>0){  
    	            response.sendRedirect("ShowEmployeeServlet");  
    	        }
    	        else{  
					pw.println("<h1>Sorry! unable to update record</h1>");  
    	        }  
    	          
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    		}
    	}
}  