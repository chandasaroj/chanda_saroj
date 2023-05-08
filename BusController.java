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

import com.app.BusApplication.Entity.Bus;
import com.app.BusApplication.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	private BusService busService;
	
	
	Logger logger=LoggerFactory.getLogger(BusController.class);
	
	@PostMapping(value ="/add")
	public ResponseEntity<Bus>addBus(@RequestBody Bus bus){
		return new ResponseEntity<Bus>(busService.addBus(bus),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getById")
	public ResponseEntity<Bus> getById(@RequestParam int id){
		return new ResponseEntity<Bus>(busService.getById(id),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getList")
	public ResponseEntity <List<Bus>> getList(){
		return new ResponseEntity<List<Bus>>(busService.getList(),HttpStatus.OK);
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<Bus> update(@RequestParam int id,@RequestBody Bus bus){
		return new ResponseEntity<Bus>(busService.update(id,bus),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete")
	public ResponseEntity<String> delete(@RequestParam int id){
		busService.delete(id);
		return new ResponseEntity<String>("bus record deleted sucessfully....",HttpStatus.OK);
	}
	

}
