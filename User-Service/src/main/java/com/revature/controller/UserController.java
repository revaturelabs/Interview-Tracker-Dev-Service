package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.UserBean;
import com.revature.service.UserRepository;

@RestController
public class UserController {
	@Autowired
	private UserRepository repo;
	List<UserBean> list;
	
	
	@GetMapping(value="/users")
	public UserBean getAll() {
//		list.add(new UserBean(1, "bodhi", "bacon"));
//		list.add(new UserBean(2, "mike", "jordan"));
//		list.add(new UserBean(3, "tarzan", "jungle"));
		return new UserBean(1, "bodhi", "bacon");
//		return list;
	}
	
	
}
