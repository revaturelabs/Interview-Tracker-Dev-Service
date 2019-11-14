package com.revature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.controller.UserController;

@RunWith(SpringRunner.class)
@DataJpaTest
//@ContextConfiguration({"classpath*:applicationContext.xml"})
//@SpringBootTest(classes=UserController.class)
public class UserServiceApplicationTests {
	@Autowired
	private UserController controller;
	@Test
	public void userGetAllTest() {
		assertEquals("bodhi", controller.getAll().getUsername());
	}
	@Test
	public void userSaveTest() {
		assertEquals("worked", controller.save());
	}

}
