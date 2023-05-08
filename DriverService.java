package com.app.BusApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.BusApplication.Entity.Driver;
import com.app.BusApplication.repository.DriverRepository;

@Service
public class DriverService {
	@Autowired
	private DriverRepository driverRepo;

	public Driver addDriver(Driver driver) {
		return driverRepo.save(driver);
	}

	public Driver getById(int id) {
		return driverRepo.findById(id).get();
	}

	public List<Driver> getList() {
		return (List<Driver>) driverRepo.findAll();
	}

	public Driver update(int id, Driver driver) {
		Driver d=driverRepo.findById(id).get();
		Driver d1=null;
		if(d!=null) {
			d.setD_name(driver.getD_name());
			d.setMob_num(driver.getMob_num());
			driverRepo.save(d);
		}
		return d1;
	}


	public void delete(int id) {
		driverRepo.deleteById(id);
		
	}
	
}
