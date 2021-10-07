package com.techment.hotelManagement.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techment.hotelManagement.api.entity.User;
import com.techment.hotelManagement.api.service.IUserService;




@RestController
@RequestMapping(value="userController")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	
	@PostMapping(value="/addUser")
	public ResponseEntity<String> addNewUser(@RequestBody User user){
		userService.addUsers(user);
		return new ResponseEntity<String>("Users added", HttpStatus.OK);
	}
	
	
	public ResponseEntity<List<User>> viewAllUser(){
		return new ResponseEntity<List<User>>(userService.showAllUsers(), HttpStatus.ACCEPTED);
		
	}

	@PutMapping(value = "/updateUserById/{id}")
	public ResponseEntity<String> updateEmployeeById(@PathVariable int id,@RequestBody User user)
	{
		//String users = userService.updateUserById(user, id);
		user.setUser_id(id);
		userService.addUsers(user);
		
		return new ResponseEntity<String>("User Updated",HttpStatus.ACCEPTED);
	}
	
	

	@GetMapping(value = "/viewUserById/{id}")
	public User getEmployeeById(@PathVariable int id)
	{
		return userService.viewUserById(id);
	}
	
	@DeleteMapping(value = "/deleteUserById/{id}")
	public ResponseEntity<String> deleteUserById(@PathVariable int id)
	{
		userService.deleteUserById(id);

		return new ResponseEntity<String>("User Deleted",HttpStatus.ACCEPTED);
	}
}
