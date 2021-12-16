package com.brillio.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brillio.model.Patient;
import com.brillio.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository repository;
	
	public Patient registerPatient(Patient patient)
	{
		return repository.save(patient);
	}
	
	

	public Patient getPatientByName(String name) {
		return  repository.findByName(name);
	}

}
