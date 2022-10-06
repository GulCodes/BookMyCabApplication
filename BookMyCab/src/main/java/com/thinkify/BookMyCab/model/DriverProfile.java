package com.thinkify.BookMyCab.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DriverProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;
	private String name;
	private String gender;
	private int age;
	
	public DriverProfile() {
		name=null; 
		gender=null;
		age=0;
	}
	public DriverProfile(String name, String gender, int age) {
	this.name=name;
	this.gender=gender;
	this.age=age;
	//System.out.println("In Driver profiles param constructor: "+name+ gender+age);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
