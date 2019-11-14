package com.revature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceApplicationTests {
	UserController uc = new UserController();
	@Test
	public void userGetAllTest() {
		assertEquals("bodhi", uc.getAll().getUsername());
	}
	public void userSaveTest() {
		assertEquals("worked", uc.save());
	}

}
