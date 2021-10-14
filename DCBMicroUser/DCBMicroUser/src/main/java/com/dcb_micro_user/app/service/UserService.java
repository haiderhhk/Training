package com.dcb_micro_user.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.dcb_micro_user.app.entity.Department;
import com.dcb_micro_user.app.entity.User;
import com.dcb_micro_user.app.repository.UserRepo;
import com.dcb_micro_user.app.valueobject.RestTemplateVo;

@Component
public class UserService {
	
	@Autowired
	UserRepo repo;
	
	@Autowired
	RestTemplate template;
	
	public void saveUser(User user) {
		repo.save(user);
	}
	
	public RestTemplateVo getIdUser(int id) {
		
		RestTemplateVo vo=new RestTemplateVo();
		
		User userobj=repo.findById(id).get();
		Department deptobj=template.getForObject("http://DEPT-SERVICE/getdept/"+userobj.getDeptId(), Department.class);
		
		vo.setUser(userobj);
		vo.setDept(deptobj);
		
		
		return vo;
	}
	
	public List<User> getAllUser() {
		
		
		return (List<User>) repo.findAll();
	}
}
