package org.kura.webflux;

import java.util.Random;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
	
	@RequestMapping("/user/{id}")
	public User getUser(@RequestParam("id") String id){
		User user = new User();
		
		return user;
	}
	
	@RequestMapping("/gettoken")
	public String getToken(){
		Random random = new Random();
		String token = String.valueOf(random.nextInt(10));

		return token;
	}
}
