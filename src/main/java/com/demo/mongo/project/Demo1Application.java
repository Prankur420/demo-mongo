package com.demo.mongo.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.demo.mongo.project.repository")
@ComponentScan("com.demo.*")
public class Demo1Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
