package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class SpringbootJenkinExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJenkinExampleApplication.class, args);
	}
	
	@GetMapping("/getMessage")
	public String getMessage(){
		return "my name is anish";
	}

}
