package com.example.Builder;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		
		
		//Creamos una isntancia de casa de la forma tradicional
		Casa piso= new  Casa("piso",1,3,2, false,"blanco");
		
		System.out.println(piso.toString());
		
		
		//Creamos una isntancia de casa con el patron builder
		 
		CasaBuilder chalet= new CasaBuilder();
		chalet
			.setTipo("chalet grande")
			.setNumeroPlantas(2)
			.setNuemeroDormitorios(4)
			.setNumeroBaños(3)
			.setTieneCochera(true)
			.setColorFachada("amarilla")
			.build();
		
		Casa nueva= chalet.build();
		
		System.out.println(nueva.toString());
		
		
	}

}
