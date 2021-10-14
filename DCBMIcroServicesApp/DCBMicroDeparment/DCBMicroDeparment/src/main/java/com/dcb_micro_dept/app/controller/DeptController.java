package com.dcb_micro_dept.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dcb_micro_dept.app.entity.Department;
import com.dcb_micro_dept.app.service.DeptService;



@RestController
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	DeptService service;
	
	@PostMapping("/insertdept")
	public String InsertDept(@RequestBody Department deptobj) {
		
		service.SaveDept(deptobj);
		//System.out.println(deptobj);
		return "Added Successfully";
	}

	
	@GetMapping("/getdept/{id}")
	public Department GetDept(@PathVariable("id") int id) {
		
		Optional<Department> deptobj=service.DeptbyID(id);
		System.out.println(deptobj.get());
		return deptobj.get();
	}

	
	@GetMapping("/getalldept")
	public List<Department> GetAllDept(){
		
		
		
		return service.DeptAll();
	}
	
}
