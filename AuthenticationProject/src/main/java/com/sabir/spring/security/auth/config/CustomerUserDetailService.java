package com.sabir.spring.security.auth.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomerUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 List<SimpleGrantedAuthority> roles = new ArrayList<>();
		 
		 if("admin".equals(username)) {
			 
			 roles.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
			 return new User ("admin", "$2a$12$PO4lq9v3LvsNR2.MAIml5Ole8/gNEIdz3OABAAbjAHtRs2AbQYINq", roles);
			 
		 }
		 if("uder".equals(username)) {
			 
			 roles.add(new SimpleGrantedAuthority("ROLE_USER"));
			 return new User ("user", "$2a$12$loMVZBZ8OElQVir/HD/ug.8PO7xFivNa3LD8GeChxeAS1fMA1QnGi", roles);
			 
			 //$2y$12$I0Di/vfUL6nqwVbrvItFVOXA1L9OW9kLwe.1qDPhFzIJBpWl76PAe
			 //$2a$12$60M9J6Hb7RkNz2PdKE/uHON6DbJgMb6vj37uDQGRNT9apwM9VL/36
			 
		 }
		
		return null;
	}

}
