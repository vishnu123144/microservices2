package com.brillio.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/login")
public class PatientController {
	
	@Autowired
    private RestTemplate restTemplate;	
	
	@GetMapping("/user1")
	public String getLoginPage()
	{
		return "Welcome to log in page";
	}
	@GetMapping("/user/{name}")
	public String getLogin(@PathVariable("name") String name) {
	
		//String url="http://localhost:8082/registration/find/"+username+"/"+password;
		
		String url="http://PATIENT-SERVICE/registration/find/"+name;
		
		String message = restTemplate.getForObject(url, String.class);
		
		return message;
		
	}

}
