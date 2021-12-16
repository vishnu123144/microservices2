package com.brillio.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brillio.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

	Patient findByName(String name);
	
	
}
