package com.brillio.model;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	
	private int id;
	
	private String name;
	private String phone;
	private Date dob;
	private String city;
	
	Patient()
	{
		super();
	}
	
	
	public Patient(int id, String name, String phone, Date dob, String city) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.dob = dob;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDate() {
		return dob;
	}
	public void setDate(Date dob) {
		this.dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	
	
	

}
