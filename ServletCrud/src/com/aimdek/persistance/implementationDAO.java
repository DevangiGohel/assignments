package com.aimdek.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aimdek.model.model;

public class implementationDAO implements interface_user {
	
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
	

	public static int insert(model m) {
		
		
		int result=0;  
        try{  
            Connection con=implementationDAO.getConnection();  
            PreparedStatement ps=con.prepareStatement("INSERT INTO employee VALUES (?,?,?)");  
            ps.setInt(1,m.getId());  
            ps.setString(2,m.getName());  
            ps.setInt(3,m.getAge());   
              
            result=ps.executeUpdate();  
              
            con.close();  
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
          
        return result;  
	}

	public static int update(model m) {
		
		int result=0;  
        try{  
            Connection con=implementationDAO.getConnection();  
            PreparedStatement ps=con.prepareStatement("UPDATE employee SET Name=?,Age=? WHERE ID=?");  
            ps.setString(1,m.getName());  
            ps.setInt(2,m.getAge());  
            ps.setInt(3,m.getId());   
              
            result=ps.executeUpdate();  
              
            con.close();  
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }  
          
        return result;  
	}



	public static int delete(int i) {
		
		int result=0;  
        try{  
            Connection con=implementationDAO.getConnection();  
            PreparedStatement ps=con.prepareStatement("DELETE FROM employee WHERE ID=?");  
            ps.setInt(1,i); 
            result = ps.executeUpdate();
            con.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	
        return result;
	}

public static model getbyId(int id) {
	model m= new model();
	try{  
        Connection con=implementationDAO.getConnection();  
        PreparedStatement ps=con.prepareStatement("select * from employee where id=?");  
        ps.setInt(1,id);  
        ResultSet rs=ps.executeQuery();  
        if(rs.next()){  
            m.setId(rs.getInt(1));  
            m.setName(rs.getString(2));  
            m.setAge(rs.getInt(3));  
        }  
        con.close();  
    }
	catch(Exception e){
		e.printStackTrace();
	}
      
    	return m;  
	}

public static List<model> employeelist(){  
    List<model> list=new ArrayList<model>();  
      
    try{  
        Connection con=implementationDAO.getConnection();  
        PreparedStatement ps=con.prepareStatement("SELECT * FROM employee");  
        ResultSet rs=ps.executeQuery();  
        while(rs.next()){  
            model m=new model();  
            m.setId(rs.getInt(1));  
            m.setName(rs.getString(2));  
            m.setAge(rs.getInt(3));
            list.add(m);  
        }  
        con.close();  
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }  
    	return list;  
			
	}  
}