package com.springboot.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecSecurityConfig {
	 @Bean 
	 public PasswordEncoder passwordEncoder() { 
	     return new BCryptPasswordEncoder(); 
	 }
	 @Bean
	 public InMemoryUserDetailsManager userDetailsService() {
	        // InMemoryUserDetailsManager (see below)
		 UserDetails user1 = User.withUsername("user1")
		            .password(passwordEncoder().encode("pass1"))
		            .roles("USER")
		            .build();
		 UserDetails user2 = User.withUsername("user2")
		            .password(passwordEncoder().encode("pass2"))
		            .roles("USER")
		            .build();
		 UserDetails admin = User.withUsername("admin")
		            .password(passwordEncoder().encode("admin"))
		            .roles("ADMIN")
		            .build();
		 return new InMemoryUserDetailsManager(user1, user2, admin);
	 }

	 @Bean
	 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        // http builder configurations for authorize requests and form login (see below)
		 
		 http.formLogin()
	         .loginPage("/login.html")
	         .loginProcessingUrl("/perform_login")
	         .defaultSuccessUrl("/homepage.html",true)
	         .failureUrl("/login.html?error=true");
	   
		 
		 return http.build(); 
	 }
}


















