package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.UserBean;
import com.revature.service.UserRepository;

@RestController
public class UserController {
<<<<<<< HEAD
	@Autowired
	private UserRepository repo;
	List<UserBean> list;
	
	
	@GetMapping(value="/users")
=======
	
	private UserRepository repository;
	
	public UserRepository getRepository() {
		return repository;
	}

	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}

	List<UserBean> list;
	
	@GetMapping(value="/getUsers")
>>>>>>> william
	public UserBean getAll() {
		list.add(new UserBean(1, "bodhi", "bacon"));
		list.add(new UserBean(2, "mike", "jordan"));
		list.add(new UserBean(3, "tarzan", "jungle"));
		return new UserBean(1, "bodhi", "bacon");
		
	}
	
	/**
	 * Created by Brittany Tinnin and William Liederer
	 * Very basic method to save a user to database
	 * @return
	 */
	 @GetMapping(value = "/users")
	    public String save() {
	        UserBean dev = new UserBean(2,"admin","admin");
	        repository.save(dev);
	        return "worked";
	    }
	 
//	 @GetMapping(value="/login")
//	 public String login() {
//		 repository.
//	 }
	
	
	
	
}
