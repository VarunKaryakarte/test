package com.FlightReservation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.FlightReservation.Model.User;
import com.FlightReservation.Repository.UserRepository;
import com.FlightReservation.Service.SecurityService;



@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/registerUser";
	}
	
	
	@RequestMapping(value = "/registerUser" , method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user) {
		
		 user.setPassword(encoder.encode(user.getPassword()));
		 userRepository.save(user);
		 return "login/login";
	}
	
	@RequestMapping("/showLogin")
	public String showLogin() {
		return "login/login";
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String login(@RequestParam("email") String email , @RequestParam("password") String password , ModelMap modelMap) {
	boolean loginResponse =  securityService.login(email, password);
		
		if(loginResponse) {
			return "findFlights";
		} else {
			modelMap.addAttribute("msg", "Invalid username or password");
		}
		return "login/login";
	}
	
}
