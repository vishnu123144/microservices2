package com.brillio.service;

import java.time.LocalDate;
import java.util.List;

import com.brillio.model.Appointment;

public interface AppointmentService {
	
	
Appointment create(Appointment appointment);
	
	List<Appointment> findAllByDate(LocalDate date);

}
