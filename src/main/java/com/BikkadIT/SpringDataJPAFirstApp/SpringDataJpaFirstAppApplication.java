package com.BikkadIT.SpringDataJPAFirstApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.SpringDataJPAFirstApp.controller.UserController;
import com.BikkadIT.SpringDataJPAFirstApp.model.User;

@SpringBootApplication
public class SpringDataJpaFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFirstAppApplication.class, args);

		UserController userController = context.getBean(UserController.class);

//      1)save () 
//		User user = new User();
//		user.setUserName("Tanuj");
//		user.setUserAge(23);
//		user.setUserEmail("tanuj@gmail.com");
//		user.setUserAddr("Banglore");
//
//		String saveUser = userController.saveUser(user);
//		System.out.println(saveUser);
//---------------------------------------------------------------------------------------------------------------------------------------
//		2) saveAll()
//		User user1 = new User();
//		user1.setUserName("Rahul");
//		user1.setUserAge(27);
//		user1.setUserEmail("rr@gmail.com");
//		user1.setUserAddr("Pune");
//
//		User user2 = new User();
//		user2.setUserName("Ganesh");
//		user2.setUserAge(26);
//		user2.setUserEmail("gm@gmail.com");
//		user2.setUserAddr("Banglore");
//
//		User user3 = new User();
//		user3.setUserName("Pankaj");
//		user3.setUserAge(24);
//		user3.setUserEmail("pankaj@gmail.com");
//		user3.setUserAddr("Nashik");
//
//		List<User> list = new ArrayList<User>();
//		list.add(user1);
//		list.add(user2);
//		list.add(user3);

//		List<User> saveAllUser = userController.saveAllUser(list);
//		for (User user : saveAllUser) {
//			System.out.println(user);
//		}

//		userController.saveAllUser(list).forEach(e -> System.out.println(e));
//---------------------------------------------------------------------------------------------------------------------------------------		

//		3)findById()
//		User singleUser = userController.getSingleUser(2);
//		System.out.println(singleUser);
//---------------------------------------------------------------------------------------------------------------------------------------		

//		4)getAllUsers
//		userController.getAllUser().forEach(e -> System.out.println(e));
//---------------------------------------------------------------------------------------------------------------------------------------		

//		5)getAllUserByIds
//		List al = new ArrayList<>();
//		al.add(5);
//		al.add(7);

//		userController.getAllUserById(al).forEach(e -> System.out.println(e));
//		System.out.println(findAllUserById);

//---------------------------------------------------------------------------------------------------------------------------------------		

	}

}
