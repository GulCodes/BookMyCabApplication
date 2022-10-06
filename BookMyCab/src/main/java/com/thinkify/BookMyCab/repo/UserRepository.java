package com.thinkify.BookMyCab.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkify.BookMyCab.model.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {
}
