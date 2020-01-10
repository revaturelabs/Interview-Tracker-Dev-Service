package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;   
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


import com.revature.model.UserBean;

@Service
//@Component
public class UserServiceImpl {
	
	
	public UserServiceImpl() {
	}

	
	@Autowired
	public UserServiceImpl(UserRepository ur) {
		super();
		this.ur = ur;
	}



	public Iterable<UserBean> getAllUsers() {
    	return ur.findAll();
    }
	
	
//	@Autowired
//	private RevatureFeignClient feignClient;

	private UserRepository ur;

//	@GetMapping("/create")
//	public String bulkcreate(){
//	// save a single Customer
//	repository.save(new UserBean(1, "Rajesh", "Bhojwani"));
//	return "Customers are created";
//	}
	

}
