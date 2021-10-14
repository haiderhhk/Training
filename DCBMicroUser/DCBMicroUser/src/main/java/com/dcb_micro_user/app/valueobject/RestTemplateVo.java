package com.dcb_micro_user.app.valueobject;

import com.dcb_micro_user.app.entity.Department;
import com.dcb_micro_user.app.entity.User;

public class RestTemplateVo {
	
	User user;
	Department dept;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public RestTemplateVo(User user, Department dept) {
		super();
		this.user = user;
		this.dept = dept;
	}
	public RestTemplateVo() {
		super();
	}
	
	
	
}
