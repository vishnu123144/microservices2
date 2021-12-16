package com.brillio.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.brillio.model.Appointment;
import com.brillio.service.AppointmentService;
import com.brillio.service.AppointmentServiceImpl;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	 @Autowired
	    private AppointmentService appointmentService;
	 
	 @RequestMapping("/createAppointment")
	 public Appointment create(@RequestBody Appointment appointment) {
	        return appointmentService.create(appointment);
	    }
	 
	 @RequestMapping("/find/{date}")
	 public List<Appointment> findAllBytDate(@RequestParam("date") LocalDate date){
		 return appointmentService.findAllByDate(date);
	 }


}
