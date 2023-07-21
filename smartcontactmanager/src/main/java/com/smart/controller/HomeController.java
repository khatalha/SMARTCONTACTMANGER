package com.smart.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smart.dao.UserRepo;
import com.smart.entities.User;
import com.smart.helper.Message;

import jakarta.servlet.http.HttpSession;

@Controller
//@RequestMapping("/home")
public class HomeController {
	
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepo userRepo;
	
	@RequestMapping("/")
	public String home(Model m) {
		
		m.addAttribute("title","Home- smart contact manager");
		return "home";
	}
	
	
	@RequestMapping("/about")
	public String about(Model m) {
		
		m.addAttribute("title","About- smart contact manager");
		return "about";
	}
	
	
	@RequestMapping("/signup")
	public String signup(Model m) {
		
		m.addAttribute("title","Signup- smart contact manager");
		m.addAttribute("user", new User());
		return "signup";
	}
	
	
	@RequestMapping(value = "/do_register" , method = RequestMethod.POST)
	public String userRegister(@Valid @ModelAttribute("user") User user ,@RequestParam(value = "aggrement" ,defaultValue = "false") boolean aggrement , Model m,BindingResult result , HttpSession session ) {
		
		
		try {
			if(!aggrement) {
				System.out.println("you have not check the terms and condition");
				throw new Exception("you have not check the terms and condition");
			}
			if(result.hasErrors()) {
				
				System.out.println("Error"+  result.toString());
				m.addAttribute("user" ,user);
				return "signup";
			}
			
			
			user.setRole("roleUser");
			user.setEnabled(true);
			//user.setPassword(passwordEncoder.encode(user.getPassword()));
			
			System.out.println("Aggrement " + aggrement);
			System.out.println("user " +user);
			User res = this.userRepo.save(user);
			m.addAttribute("user", new User());
			
			session.setAttribute("message", new Message("Submit successfully Register","alert-success"));
			return "signup";
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("message", new Message("Something went wrong","alert-denger"));
			return "signup";
		}
		
	}
	
	@GetMapping("/signin")
	public String customlogin(Model model) {
		model.addAttribute("title","Signin- Login page");
		return "login";
	}
	
	
	@RequestMapping("/signon")
	public String loginpage(@ModelAttribute("user") User user) {
		user.setEmail("test@gmail");user.setPassword("1234");
		if(user.getEmail().equals("test@gmail.com") && (user.getPassword().equals("1234"))) {
			System.out.println("login succesfully");
			return "normal/dash_board";
		}
		System.out.println("login error");
		return "login";
	}
	
	

}
