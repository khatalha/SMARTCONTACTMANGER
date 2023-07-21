package com.smart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;

import com.smart.controller.UserdetaisServiceImpl;

@Configuration
//@EnableMethodSecurity(prePostEnabled = true)
public class MyConfig{
	
	
//	@Bean
//	public UserDetailsService getUserDetailsService() {
//		
//		return new UserdetaisServiceImpl();
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	
//	@Bean
//	public DaoAuthenticationProvider authenticationProvider() {
//		
//		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
//		daoAuthenticationProvider.setUserDetailsService(getUserDetailsService());
//		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//		
//		return daoAuthenticationProvider;
//		
//	}
//	
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//		
//		httpSecurity.csrf().disable().authorizeHttpRequests()
//		.requestMatchers("/admin/**").hasRole("Admin").requestMatchers("/user/**").hasRole("USER")
//		.requestMatchers("/**")
//		.permitAll().anyRequest().authenticated()
//		.and().formLogin().loginpage("/signin");
//		return httpSecurity.build();
//		
//	
//	}
	
	
	
	
	

}
