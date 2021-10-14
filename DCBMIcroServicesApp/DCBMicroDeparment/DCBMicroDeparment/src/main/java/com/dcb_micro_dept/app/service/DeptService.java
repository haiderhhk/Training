package com.dcb_micro_dept.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dcb_micro_dept.app.entity.Department;
import com.dcb_micro_dept.app.repository.DeptRepo;

@Component
public class DeptService {

	@Autowired
	DeptRepo repo;
	
	public void SaveDept(Department deptobj) {
			
		repo.save(deptobj);
	}
	
	public Optional<Department> DeptbyID(int id) {
		return (repo.findById(id));
		
	}
	
	
	public List<Department> DeptAll() {
		
		List<Department> list_dept=(List<Department>)repo.findAll();
		
		return list_dept;
		
	}
}
