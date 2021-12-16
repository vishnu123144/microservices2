package com.brillio.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brillio.model.Appointment;
import com.brillio.repository.AppointmentRepository;

@Component("appointmentService")
public class AppointmentServiceImpl implements AppointmentService {
	
	@Autowired
	private AppointmentRepository repository;

	
	public Appointment create(Appointment appointment) {
		
		return repository.save(appointment);
	}

	
	public List<Appointment> findAllByDate(LocalDate date) {
		
		return repository.findAllByDate(date);
	}

}
