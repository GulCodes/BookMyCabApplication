package com.thinkify.BookMyCab.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Car {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private UUID id;
private String name;
private String nameplate;

public Car() {
	name=null; 
	nameplate=null;
}
public Car(String name, String nameplate) {
	this.name=name;
	this.nameplate=nameplate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNameplate() {
	return nameplate;
}
public void setNameplate(String nameplate) {
	this.nameplate = nameplate;
}

}
