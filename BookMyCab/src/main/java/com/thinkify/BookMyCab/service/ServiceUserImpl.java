package com.thinkify.BookMyCab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thinkify.BookMyCab.model.AppUser;
import com.thinkify.BookMyCab.repo.UserRepository;

@Service
public class ServiceUserImpl implements IBookMyCabService<AppUser>{
	
	@Autowired
	UserRepository repoObj;

	public void add(AppUser newUser) {
		repoObj.save(newUser);
		
	}

}
