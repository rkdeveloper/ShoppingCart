package com.niit.shoppingcart;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

public class UserTest {
	
public static void main(String[] args){
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	
	context.scan("com.niit.shoppingcart");
	context.refresh();
	
	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
	User user = (User) context.getBean("user");
	
	
	user.setId("CG120");
	user.setName("CGname120");
	user.setAddress("CGDesc120");
	user.setMail("abd@gmail.com");
	user.setMobile("10101010");
	user.setPassword("password");

	userDAO.saveOrUpdate(user);
	
}
}
