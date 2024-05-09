package com.phs.apirestfulmongodb.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.phs.apirestfulmongodb.domain.User;
import com.phs.apirestfulmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		
		User t1 = new User(null, "teste1", "teste1@gmail.com");
		User t2 = new User(null, "teste2", "teste2@gmail.com");
		User t3 = new User(null, "teste3", "teste3@gmail.com");	
		
		userRepository.saveAll(Arrays.asList(t1, t2, t3));
	}

}
