package com.BikkadIT.SpringDataJPAFirstApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.SpringDataJPAFirstApp.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	

}
