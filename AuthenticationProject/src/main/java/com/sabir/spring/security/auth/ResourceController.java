package com.sabir.spring.security.auth;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping("/hellouser")
	public String helloUser() {
		return "Hello User !!!";
	}
	
	@RequestMapping("/helloadmin")
	public String helloAdmin() {
		return "Hello Admin !!!";
	}

}