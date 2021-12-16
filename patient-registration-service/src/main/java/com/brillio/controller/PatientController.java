package com.brillio.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.model.Patient;
import com.brillio.service.PatientService;

@RestController
@RequestMapping("/registration")
public class PatientController {
	
	@Autowired
	private PatientService service;
	
	@GetMapping("/user")
	public String getPatientDetails()
	{
		return "welcome to the hospital";
	}
	
	@GetMapping("/find/{name}")
	public String getPatientByName(@PathVariable("name") String name)
	{
		Patient getbyname=service.getPatientByName(name);
		if(getbyname!=null)
		{
			return "log in successfully";
		}
		return "Invalid username or password";
	}
	
	@PostMapping("/savePatient")
	public String registerPatient(@RequestBody Patient patient)
	{
		Patient registerPatient=service.registerPatient(patient);
		if(registerPatient!=null)
		{
			return "patient details saved";
		}
		return "no patient available";
	}
	
	
	
	
	
	

}
