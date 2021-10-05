package com.techment.hotelManagement.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.techment.hotelManagement.api.dao.IUserDao;
import com.techment.hotelManagement.api.entity.User;

public class UserImplService implements IUserService{
	
	@Autowired
	IUserDao userDao;
	
	@Override
	public String addUsers(User user) {
		userDao.save(user);
		return "Users Saved";
	}

	@Override
	public List<User> showAllUsers() {
		
		return userDao.findAll();
	}
	
	@Override
	public String updateUserById(User user, int id) {
		 userDao.save(user);
		return null;
	}

	@Override
	public String deleteUserById(int id) {
		userDao.deleteById(id);
		return "User Deleted";
	}

	@Override
	public User viewUserById(int id) {
		return userDao.findById(id).get();
		
	}
	
	

}
