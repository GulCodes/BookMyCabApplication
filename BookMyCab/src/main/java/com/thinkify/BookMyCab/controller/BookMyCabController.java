package com.thinkify.BookMyCab.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinkify.BookMyCab.model.Driver;
import com.thinkify.BookMyCab.model.AppUser;
import com.thinkify.BookMyCab.service.ServiceDriverImpl;
import com.thinkify.BookMyCab.service.ServiceUserImpl;

@RestController
public class BookMyCabController {

	@Autowired
	ServiceUserImpl userServiceObj;
	
	@Autowired
	ServiceDriverImpl driverObj;
	
	
	@PostMapping("/add-user")
	public ResponseEntity<AppUser> add_user(@RequestBody AppUser newUser) {
		try {
		userServiceObj.add(newUser);
		return new ResponseEntity<>(newUser,HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR); }
	}
	
	@PostMapping("/add-driver")
	public ResponseEntity<Driver> add_driver(@RequestBody Driver newDriver) {
		try {
		driverObj.add(newDriver);
		return new ResponseEntity<>(newDriver, HttpStatus.CREATED);}
		catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/find-ride")
	public ResponseEntity<String> find_ride(@RequestParam String username, @RequestParam int sourceX, @RequestParam int sourceY,
			@RequestParam int destX, @RequestParam int destY) {
	   try {
		int[] source= {sourceX,sourceY};
		int[] dest=  {destX,destY};
		List<Driver> li = driverObj.getNearestDrivers(username,source,dest); 
		System.out.println("List of drivers" + li);
		if (li==null)
			return new ResponseEntity<>("No Ride Found. Sorry for the inconvinience!",HttpStatus.SERVICE_UNAVAILABLE);
		else return new ResponseEntity<>(driverObj.choose_ride(username,li)+ " is your driver for your ride.",HttpStatus.OK);
	}
	catch(Exception e) {
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	}
	

}
