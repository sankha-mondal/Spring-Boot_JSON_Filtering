package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJsonFilteringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJsonFilteringApplication.class, args);
		System.out.println("Spring-Boot Json Filtering Application running on port NOo 8585..");
	}
		//  Add @JsonIgnore w r t field-attribute
}
