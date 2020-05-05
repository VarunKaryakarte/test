package com.Competition.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Competition.entity.User;
import com.Competition.entity.UserRequest;
import com.Competition.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@RequestMapping("/signup")
	private String showRegistration() {
		return "showRegistration";
	}
	
	@PostMapping("/login")
	private String saveUser(@RequestParam("firstName") String firstName , @RequestParam("lastName") String lastName
							,@RequestParam("email") String email ,@RequestParam("password") String password) {
		
		
		
		
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.set
		
		repository.save(user);
		
		return "display";
	
	}

}
