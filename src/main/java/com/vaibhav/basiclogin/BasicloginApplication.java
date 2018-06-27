package com.vaibhav.basiclogin;

import com.vaibhav.basiclogin.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicloginApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BasicloginApplication.class, args);
	}

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... strings) throws Exception {
		logger.info("All Users -> {}", userRepository.findAll());
		logger.info("User with username 'dbuser1' -> {}", userRepository.findByuserName("dbuser1"));
	}
}
