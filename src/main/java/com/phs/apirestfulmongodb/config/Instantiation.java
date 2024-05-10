package com.phs.apirestfulmongodb.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.phs.apirestfulmongodb.domain.Post;
import com.phs.apirestfulmongodb.domain.User;
import com.phs.apirestfulmongodb.dto.AuthorDTO;
import com.phs.apirestfulmongodb.repository.PostRepository;
import com.phs.apirestfulmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postReposiroty;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		userRepository.deleteAll();
		postReposiroty.deleteAll();
		
		User t1 = new User(null, "teste1", "teste1@gmail.com");
		User t2 = new User(null, "teste2", "teste2@gmail.com");
		User t3 = new User(null, "teste3", "teste3@gmail.com");	
		
		userRepository.saveAll(Arrays.asList(t1, t2, t3));
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para São Paulo. Abraços!", new AuthorDTO(t1));
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!", new AuthorDTO(t1));
		
		postReposiroty.saveAll(Arrays.asList(post1, post2));
	}

}
