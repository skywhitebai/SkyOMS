package com.sky.oms.service;
import java.util.List;

import com.sky.oms.model.User;

public interface UserService {

	User getUserById(int userId);
	List<User> getUsers();
	int insert(User user);
}
