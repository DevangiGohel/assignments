package com.aimdek.controller;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aimdek.model.model;
import com.aimdek.persistance.implementationDAO;


@WebServlet("/ShowEmployeeServlet")
public class ShowEmployeeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		try {
			
			response.setContentType("text/html");  
		     PrintWriter out=response.getWriter(); 
		     out.println("<center>");
		     out.println("<h1><a href='index.html'>Add new record</a></h1>");  
		     out.println("<h1>Employees List</h1>");  
		       
		     List<model> list=implementationDAO.employeelist();  
		     out.println("<style>");
		     out.println("table,th,td {");
		     out.println(" border-collapse: collapse;");
		     out.println("padding:20px;");
		     out.println("border: 1px solid black;");
		     out.println("}");
		     out.println("</style>");
		     out.print("<table>");   
		     out.print("<tr><th>Id</th><th>Name</th><th>Age</th><th>Edit</th><th>Delete</th></tr>");  
		     for(model m:list){
		      out.print("<tr><td>"+m.getId()+"</td><td>"+m.getName()+"</td><td>"+m.getAge()+"</td><td><a href='updateServlet?id="+m.getId()+"'>update</a></td> "
		      		+ "<td><a href='Deletedataservlet?id="+m.getId()+"'>delete</a></td></tr>");  
		     }  
		     out.print("</table>"); 
		     out.println("<center>");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
     
}
