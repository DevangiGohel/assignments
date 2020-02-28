package com.aimdek.jsp.persistent;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aimdek.jsp.model.Employee;

public class EmpDAO
{
	
	public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb","root","root");  
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
        return con;  
    }  	 
	public static int insert(Employee employee){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("INSERT INTO emp(name,age) VALUES(?,?)");  
	        ps.setString(1,employee.getName());   
	        ps.setInt(2,employee.getAge());  
	        status=ps.executeUpdate();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }  
	    return status;  
	}  
	
	public static int update(Employee employee){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("UPDATE emp SET name=?,age=? WHERE id=?");  
	         
	        ps.setString(1,employee.getName());
	        ps.setInt(2,employee.getAge());
	        ps.setInt(3,employee.getId());
	        
	        status=ps.executeUpdate();  
	    }
	    catch(Exception e){
	    	System.out.println(e); 
	    }
	    return status;  
	}  
	public static int delete(Employee employee){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("DELETE FROM emp WHERE id=?");  
	        ps.setInt(1,employee.getId());  
	        status=ps.executeUpdate();  
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }  
	  
	    return status;  
	}  
	public static List<Employee> getAllRecords(){  
	    List<Employee> list=new ArrayList<Employee>();  
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM emp");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            Employee employee=new Employee();  
	            employee.setId(rs.getInt("id"));  
	            employee.setName(rs.getString("name"));  
	            employee.setAge(rs.getInt("age"));  
	            
	            list.add(employee);  
	        }  
	    }
	    catch(Exception e){
	    	System.out.println(e);  
	    }
	    return list;  
	}  
	public static Employee getRecordById(int id){  
	    Employee employee=null;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM emp WHERE id=?");  
	        ps.setInt(1,id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            employee=new Employee();  
	            employee.setId(rs.getInt("id"));  
	            employee.setName(rs.getString("name"));  
	            employee.setAge(rs.getInt("age"));
	        }  
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);  
	    }
	    return employee;  
		
	}
}
	
	

