package com.sky.oms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.oms.dao.UserMapper;
import com.sky.oms.model.User;
import com.sky.oms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	public User getUserById(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	public List<User> getUsers() {
		return null;
	}

	public int insert(User user) {
		 int result = userMapper.insert(user);  
		 return result;  
	}

}
