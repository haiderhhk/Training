package com.dcb_micro_user.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	int userId;
	
	String userName;
	String deptId;
	
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", deptId=" + deptId + "]";
	}
	public User() {
		super();
	}
	public User(int userId, String userName, String deptId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.deptId = deptId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	
	
}
