package com.brillio.repository;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brillio.model.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer>{
	
	List<Appointment> findAllByDate(LocalDate date);

	
}
