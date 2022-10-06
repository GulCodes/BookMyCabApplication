package com.thinkify.BookMyCab.model;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity

public class Driver {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;
	@OneToOne(cascade = {CascadeType.ALL})
	@JsonProperty("driverdets")
	private DriverProfile driverDets;
	@OneToOne(cascade = {CascadeType.ALL})
	private Car car;
	private int[] location;
	private boolean isAvailable;
	
	public Driver() {
		driverDets = new DriverProfile();
		location=null;
		isAvailable=true;
		car = new Car();
	}
	public Driver(DriverProfile d,Car c,int[] location) {
		
		driverDets = new DriverProfile(d.getName(),d.getGender(),d.getAge());
		this.location= location;
		isAvailable = true;
		car = new Car(c.getName(),c.getNameplate());
	}
	
	public DriverProfile getDriverProfile() {
		return driverDets;
	}
	public void setDriverProfile(DriverProfile driverDets) {
		this.driverDets = driverDets;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public int[] getLocation() {
		return location;
	}
	public void setLocation(int[] location) {
		this.location = location;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	
	
	
}
