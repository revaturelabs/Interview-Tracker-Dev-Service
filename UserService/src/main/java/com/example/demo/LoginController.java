package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LoginController {
	
	  @Autowired
	    UserClient userClient;
	    
	    @GetMapping()
	    public List<User> getModel()
	    {
	        return userClient.getUsers();
	    }

}
