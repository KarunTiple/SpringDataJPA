package com.BikkadIT.SpringDataJPAFirstApp.service;

import java.util.List;

import com.BikkadIT.SpringDataJPAFirstApp.model.User;

public interface UserServiceI {

	public int saveUser(User user);

	public List<User> saveAllUser(List<User> list);

	public User getSingleUser(int userId);

	public List<User> getAllUser();

	public List<User> getAllUserById(List<Integer> list);

}
