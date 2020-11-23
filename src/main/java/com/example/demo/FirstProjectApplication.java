package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(FirstProjectApplication.class, args);
		Alien a=context.getBean(Alien.class);
		a.show();
		//Alien a1=context.getBean(Alien.class);
		//a1.show();
		
	}

}
