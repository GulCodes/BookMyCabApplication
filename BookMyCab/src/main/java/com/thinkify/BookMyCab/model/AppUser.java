package com.thinkify.BookMyCab.model;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class AppUser {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private UUID id;
	private String name;
	private char gender;
	private int age;
	
public AppUser(String name, char c, int age) {
		this.name=name;
		this.gender=c; 
		this.age=age;
	}
public AppUser(){
	name=null; gender= '\u0000'; age=0;
}

public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
