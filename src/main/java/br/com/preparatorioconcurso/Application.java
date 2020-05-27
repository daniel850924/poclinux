package br.com.preparatorioconcurso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		System.getProperty("user.dir");
		SpringApplication.run(Application.class, args);
	}
}
