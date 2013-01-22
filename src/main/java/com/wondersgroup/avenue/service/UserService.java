package com.wondersgroup.avenue.service;

import java.util.List;

import com.wondersgroup.avenue.model.UserPeer;

public interface UserService {
	
	public UserPeer getUser(long id);
	
	public List<UserPeer> getAllUser();
	
}
