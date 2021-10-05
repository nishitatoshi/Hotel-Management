package com.techment.hotelManagement.api.service;

import java.util.List;

import com.techment.hotelManagement.api.entity.User;


public interface IUserService {

	String addUsers(User user);
	List<User> showAllUsers();
	String updateUserById(User user,int id);
	String deleteUserById(int id);
	User viewUserById(int id);
}
