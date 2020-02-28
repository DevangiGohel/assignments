package com.aimdek.jsp.service;
import java.util.List;

import com.aimdek.jsp.model.Employee;


interface Service {
	

	public interface RegService {
		
		public static int insert(Employee employee) {
			return 0;
		}
		
		public static int delete(Employee employee){
			return 0;
		}
			
		public static List<Employee> getAllRecords() {
			return null;
		}
		public static Employee getRecordById(int id) {
			return null;
			
		}
	}

}
