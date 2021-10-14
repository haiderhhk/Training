package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Department;
import service.DepartmentService;


@RequestMapping("/department")
@Controller
public class DepartmentController {
	@Autowired
	DepartmentService deptService;
	@RequestMapping("/add/{deptName}/{hodName}")
	public String addDepartment(@PathVariable String deptName,@PathVariable String hodName,Model model){
		boolean flag=false;
		Department dept=new Department();
		dept.setDeptName(deptName);
		dept.setHodName(hodName);
		flag=deptService.addDepartment(dept);
		if(flag){
			model.addAttribute("dept",dept);
			return "deptSuccess";
		}
		else
			return "error";
	}
	

}
