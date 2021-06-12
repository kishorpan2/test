package com.kishorpandey.awsebexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsEbExampleApplication {
	@GetMapping("/status")
	public String deploy(){
		return "application deployed to Chanaute";
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsEbExampleApplication.class, args);
	}

}

