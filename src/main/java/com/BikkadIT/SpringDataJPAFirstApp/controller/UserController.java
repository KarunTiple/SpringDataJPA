package com.BikkadIT.SpringDataJPAFirstApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.BikkadIT.SpringDataJPAFirstApp.model.User;
import com.BikkadIT.SpringDataJPAFirstApp.service.UserServiceI;

@Component
public class UserController {

	@Autowired
	private UserServiceI userServiceI;

	public String saveUser(User user) {

		int saveUser = userServiceI.saveUser(user);
		String msg = "User saved with Id" + saveUser;
		return msg;
	}

	public List<User> saveAllUser(List<User> list) {

		List<User> saveAllUser = userServiceI.saveAllUser(list);
		return saveAllUser;
	}

	public User getSingleUser(int userId) {
		User findById = userServiceI.getSingleUser(userId);
		return findById;
	}

	public List<User> getAllUser() {
		List<User> allUser = userServiceI.getAllUser();
		return allUser;
	}

	public List<User> getAllUserById(List<Integer> list) {
		List<User> getAllUserById = userServiceI.getAllUserById(list);
		return getAllUserById;

	}
}
