package com.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.jooq.generated.tables.daos.UserDao;
import com.it.jooq.generated.tables.pojos.User;
import com.it.service.IUserService;

@Service
public class UserService implements IUserService{

	@Autowired
	private UserDao userDao;

	@Override
	public User findById(Integer id) {
		return userDao.findById(id);
	}
	
}
