package com.smart.controller;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.smart.config.CustomUserDetails;
import com.smart.dao.UserRepo;
import com.smart.entities.User;

public class UserdetaisServiceImpl {
	
	
	// implements UserDetailsService
	
//	
//	@Autowired
//	private UserRepo userRepo;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		User user = userRepo.getUserByUserName(username);
//		
//		if(user==null) {
//			 throw new UsernameNotFoundException("Could Not Found user !!");
//			 
//		}
//		
//		CustomUserDetails customUserDetails = new CustomUserDetails(user); 
//		
//		return customUserDetails;
//	}
//	
	

}
