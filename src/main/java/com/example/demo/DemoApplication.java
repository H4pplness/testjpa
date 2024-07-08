package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		DemoApplication app = context.getBean(DemoApplication.class);
		app.run();
	}

	public void run() {
		userRepository.findAll().forEach(user -> {
			System.out.println(user.getId());
		});
	}
}
