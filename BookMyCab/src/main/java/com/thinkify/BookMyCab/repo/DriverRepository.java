package com.thinkify.BookMyCab.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thinkify.BookMyCab.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {

}
