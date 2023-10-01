package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test") // test tem que ser igual colocamos no application.properties
public class TestConfig implements CommandLineRunner{

	@Autowired // injecao de dependencia do spring
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { // tudo que colocar dentro desse metodo run vai ser executado junto da aplicacao
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); // id nulo por que vai ser gerado pelo banco de dados
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
		userRepository.saveAll(Arrays.asList(u1,u2)); //saveAll salva a list no banco de dados
		
	}
	
	
	
	
	
}
