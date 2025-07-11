package com.example.Spring0auth;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Spring0authApplication {

	public static void main(String[] args) {

		SpringApplication.run(Spring0authApplication.class, args);



	}

	@PostConstruct
	public void checkEnv() {
		System.err.println("=== Variables de entorno ===");
		System.err.println("GITHUB_CLIENT_ID: " + System.getenv("GITHUB_CLIENT_ID"));
		System.err.println("GITHUB_CLIENT_SECRET: " + System.getenv("GITHUB_CLIENT_SECRET"));
	}

}
