package com.thinkify.BookMyCab.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinkify.BookMyCab.model.AppUser;
import com.thinkify.BookMyCab.model.Driver;
import com.thinkify.BookMyCab.repo.DriverRepository;

@Service
public class ServiceDriverImpl implements IBookMyCabService<Driver> {
	
	@Autowired
	DriverRepository repoObj;

	public void add(Driver newDriver) {
		repoObj.save(newDriver); }
	
	public List<Driver> getNearestDrivers(String uname,int[] source,int[] dest){
		
		List<Driver> driverList=new ArrayList<Driver>();
		
		for( long i=0;i<repoObj.findAll().size();i++) {
			Driver d= repoObj.getReferenceById(i);

			if(!d.isAvailable()) continue; // If driver's already booked, check for next
			
			int[] driverLoc =  d.getLocation();
			int dist = (int) (Math.pow((dest[1]-driverLoc[1]),2)+Math.pow((dest[0]-driverLoc[0]),2));
			System.out.println("Distance between "+ uname + " and " + d.getDriverProfile().getName() + " : "+ dist);
			if (Math.sqrt(dist)<=5) {
				driverList.add(d);    }
		}
		return driverList;
	}

	public String choose_ride(String username, List<Driver> li) {
		Driver chosen = li.get(0);
		chosen.setAvailable(false);
		return chosen.getDriverProfile().getName();
	}
	
}
