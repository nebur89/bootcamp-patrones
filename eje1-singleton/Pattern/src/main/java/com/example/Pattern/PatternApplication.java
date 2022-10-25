package com.example.Pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import singleton.Persona;

@SpringBootApplication
public class PatternApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
		Persona person = Persona.getSingletonInstance("ruben", 31);
		
		
		
		
	}

}
