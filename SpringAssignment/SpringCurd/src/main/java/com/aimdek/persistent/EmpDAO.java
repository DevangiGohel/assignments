package com.aimdek.persistent;

import java.util.List;

import com.aimdek.model.EmplModel;

public interface EmpDAO {
	
	public void insert(EmplModel emplmodel);
	
	public void delete(int id);
	
	public EmplModel get(int id);
	
	public List<EmplModel> list();
	
}
