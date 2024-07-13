package com.sabir.spring.security.auth.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration{
	
	@Bean
	public SecurityFilterChain  securityFIlterChain(HttpSecurity http) throws Exception {
		
		 http
		 	.csrf().disable()
			.authorizeHttpRequests(auth -> auth.requestMatchers("/helloadmin").hasAnyRole("ADMIN"))
			.authorizeHttpRequests(auth -> auth.requestMatchers("/hellouser").hasAnyRole("ADMIN", "USER"))
			
			.httpBasic();
		 
		 	return http.build();
		
		
	}

	
}
