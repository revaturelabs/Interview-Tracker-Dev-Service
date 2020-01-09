package com.revature.controller;


import java.util.List;     


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



import com.revature.UnauthorizedException;

import com.revature.model.UserBean;
import com.revature.service.UserRepository;
//import com.revature.service.UserServiceImpl;


@RestController
//@CrossOrigin(origins = "*")
@RequestMapping(value = "/users")
public class UserController {
	@Autowired
	private UserRepository repository;

	/**
	 * <p>Very basic method to save a user to database</p>
	 * 
	 * @author William Liederer and Brittany Tinnin
	 */
	 @GetMapping(value = "/users")
	    public String save() {
	        UserBean dev = new UserBean(2,"admin","admin");
	        repository.save(dev);
	        return "worked";
	    }

	/**
	 * <p>
	 * Login Method
	 * </p>
	 * 
	 * @author Brittany Tinnin
	 * @param user the user information from logging in
	 * @return the user information after username is verified
	 */
	@PostMapping(value = "/login")
	public @ResponseBody UserBean login(@RequestBody UserBean user) {
		for (UserBean u : repository.findAll()) {
			if (user.getUsername().equals(u.getUsername())) {
				return u;
			}
		}
		return null;
	}

	/**
	 * <p>
	 * Find all users Method
	 * </p>
	 * 
	 * @author Brittany Tinnin
	 * @return a list of all users
	 */
	@GetMapping(value = "/allusers")
	public Iterable<UserBean> findAll() {
		return repository.findAll();
	}
	
	@PostMapping(value = "/authorize")
	public boolean authorizeUser(@RequestHeader(name = "auth") String token) {
		UserBean u = repository.findByUsername(token);
		if(u == null) {
			throw new UnauthorizedException();
		} else {
			return true;
		}
	}
}
