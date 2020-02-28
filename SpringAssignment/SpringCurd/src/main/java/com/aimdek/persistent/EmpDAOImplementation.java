package com.aimdek.persistent;

import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.aimdek.model.EmplModel;

public class EmpDAOImplementation implements EmpDAO{

	
	  JdbcTemplate jdbctemplate;
	 
	  public EmpDAOImplementation(DataSource dataSource) {
	  
		  jdbctemplate = new JdbcTemplate(dataSource); }
	 
	@Override
	public void insert(EmplModel emplmodel) {
		// TODO Auto-generated method stub
		if(emplmodel.getId()>0) {
			String sql = "UPDATE employeee SET name = ?,city = ? WHERE id = ?";
			jdbctemplate.update(sql,emplmodel.getName(),emplmodel.getCity(),emplmodel.getId());
		}
		else if(emplmodel.getName().isEmpty() && emplmodel.getCity().isEmpty()) {
			System.out.println("Enter values");
		}
		else {
			String insert = "INSERT INTO employeee(id,name,city) VALUES(?,?,?)";
			jdbctemplate.update(insert,emplmodel.getId(),emplmodel.getName(),emplmodel.getCity());
		}
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String delete = "DELETE FROM employeee WHERE id = ?";
		jdbctemplate.update(delete,id);
	}

	@Override
	public List<EmplModel> list() {
		String select = "SELECT * FROM employeee";
	    List<EmplModel> listEmployee = jdbctemplate.query(select, new RowMapper<EmplModel>() {
	 
	        @Override
	        public EmplModel mapRow(ResultSet rs, int rowNum) throws SQLException {
	        	EmplModel emplmodel = new EmplModel();
	 
	        	emplmodel.setId(rs.getInt("id"));
	        	emplmodel.setName(rs.getString("name"));
	        	emplmodel.setCity(rs.getString("city"));
	 
	            return emplmodel;
	        }
	 
	    });
	 
	    return listEmployee;
	}
	
	public EmplModel get(int id) {
	    String sql = "SELECT * FROM employeee WHERE id =" + id;
	    return jdbctemplate.query(sql, new ResultSetExtractor<EmplModel>() {
	 
	        @Override
	        public EmplModel extractData(ResultSet rs) {
	            try {
					if (rs.next()) {
					    EmplModel model = new EmplModel();
					    model.setId(rs.getInt("id"));
					    model.setName(rs.getString("name"));
					    model.setCity(rs.getString("city"));
					    
					    return model;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	 
	            return null;
	        }
	 
	    });
	}

	

}
