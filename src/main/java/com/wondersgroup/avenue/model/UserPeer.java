package com.wondersgroup.avenue.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.wondersgroup.avenue.service.UserService;
import com.wondersgroup.avenue.service.UserServiceImpl;

@Entity
@Table(name="avenue_user")
public class UserPeer implements Serializable {

	private static final long serialVersionUID = 5851439310695670101L;
	
	private long id;
	private String loginName;
	private String password;
	
	private UserServiceImpl us = new UserServiceImpl();

	@Id
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
