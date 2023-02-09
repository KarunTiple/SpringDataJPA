package com.BikkadIT.SpringDataJPAFirstApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringDataJPAFirstApp.model.User;
import com.BikkadIT.SpringDataJPAFirstApp.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private UserRepository userRepository;

	@Override
	public int saveUser(User user) {
		User user1 = userRepository.save(user);

		return user1.getUserId();
	}

	@Override
	public List<User> saveAllUser(List<User> list) {
		Iterable<User> saveAll = userRepository.saveAll(list);
		return (List<User>) saveAll;
	}

	@Override
	public User getSingleUser(int userId) {
		User findById = userRepository.findById(userId).get();
		return findById;
	}

	@Override
	public List<User> getAllUser() {
		Iterable<User> findAll = userRepository.findAll();
		return (List<User>) findAll;
	}

	@Override
	public List<User> getAllUserById(List<Integer> list) {
		Iterable<User> findAllById = userRepository.findAllById(list);
		return (List<User>) findAllById;
	}

}
