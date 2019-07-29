package org.kura.webflux;

import java.util.Random;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable("id") String id){
		User user = new User();
		user.setId(id);
		user.setName("TEST " + id);
		user.setEmail(id + "@test.com");
		log.info("getUser :" + user.toString());
		return user;
	}
	
	@RequestMapping("/gettoken")
	public String getToken(){
		Random random = new Random();
		String token = String.valueOf(random.nextInt(10000000) + 10000000);
		log.info("getToken :" + token);

		return token;
	}
}
