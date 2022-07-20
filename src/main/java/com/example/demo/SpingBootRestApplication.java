package com.example.demo;

 

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
 

@SpringBootApplication(scanBasePackages = {"com.example.service"}) 
public class SpingBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpingBootRestApplication.class, args);
	}
 
  
	
	
}
