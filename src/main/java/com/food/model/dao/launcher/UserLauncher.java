package com.food.model.dao.launcher;

import java.util.Iterator;
import java.util.List;

import com.food.model.dao.impl.UserDAOImpl;
import com.food.model.dao.model.User;

public class UserLauncher {

	public static void main(String[] args) {
		
		//User user = new User("rajprasath","rajprasath@gmail.com","raj12345",9043438319l);
		UserDAOImpl launcher = new UserDAOImpl();
		//int u = launcher.insert(user); 
		List<User> users = launcher.fetchAll();
		for(User u : users) {
			
			System.out.println(u);
		}

	}
	
}
