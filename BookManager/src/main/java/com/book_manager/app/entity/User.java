package com.book_manager.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	String userName;
	
	@Id
	String userEmail;
	
	String userPhone;
	
	String userJob;

	
	String userPassword;

	String userRole;
	
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userJob="
				+ userJob + ", userPassword=" + userPassword + ", userRole=" + userRole + "]";
	}

	public User(String userName, String userEmail, String userPhone, String userJob, String userPassword,
			String userRole) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userJob = userJob;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public User() {
		super();
	}

	public User(String userName, String userEmail, String userPhone, String userJob, String userPassword) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.userJob = userJob;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserJob() {
		return userJob;
	}

	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
}
