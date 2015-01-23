package cz.mancini.jba.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cz.mancini.jba.entity.User;
import cz.mancini.jba.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	//Creates The Form
	@ModelAttribute("user")
	public User constructUser() {
		return new User();
	}
	
	//Shows the Register Page
	@RequestMapping
	public String showRegister() {
		return "user-register";
	}

	//Receives the Form from the User and Saves it into DB
	@RequestMapping(method = RequestMethod.POST)
	public String doRegister(@Valid @ModelAttribute("user") User user, BindingResult result) {
		if(result.hasErrors()){
			return "user-register";
		}
		userService.save(user);
		return "redirect:/register.html?sucess=true";
	}
	
	@RequestMapping("/available")
	@ResponseBody
	public String available(@RequestParam String username){
		Boolean available = userService.findOne(username) == null;
		return available.toString();
	}
}
