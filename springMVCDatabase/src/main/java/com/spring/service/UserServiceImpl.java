package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.dao.UserDao;
import com.spring.model.Login;
import com.spring.model.User;

public class UserServiceImpl implements UserService {
	@Autowired
	public UserDao userDao;
	
	public void register(User user) {
		userDao.register(user);
	}
		public User validateUser(Login login)
		{
			return userDao.validateUser(login);
		}
}
