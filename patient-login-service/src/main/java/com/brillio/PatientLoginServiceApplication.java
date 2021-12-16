package com.brillio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PatientLoginServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientLoginServiceApplication.class, args);
	}

}
