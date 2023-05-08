package com.app.BusApplication.controller;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.BusApplication.Entity.Driver;
import com.app.BusApplication.service.DriverService;


@RestController
@RequestMapping("/driver")
public class DriverController {
	@Autowired
	private DriverService driverService;
	
	
	Logger logger=LoggerFactory.getLogger(BusController.class);
	
	@PostMapping(value ="/add")
	public ResponseEntity<Driver>addDriver(@RequestBody Driver driver){
		return new ResponseEntity<Driver>(driverService.addDriver(driver),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getById")
	public ResponseEntity<Driver> getById(@RequestParam int id){
		return new ResponseEntity<Driver>(driverService.getById(id),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getList")
	public ResponseEntity <List<Driver>> getList(){
		return new ResponseEntity<List<Driver>>(driverService.getList(),HttpStatus.OK);
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<Driver> update(@RequestParam int id,@RequestBody Driver driver){
		return new ResponseEntity<Driver>(driverService.update(id,driver),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete")
	public ResponseEntity<String> delete(@RequestParam int id){
		driverService.delete(id);
		return new ResponseEntity<String>("driver record deleted sucessfully....",HttpStatus.OK);
	}

}
