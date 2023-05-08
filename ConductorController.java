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

import com.app.BusApplication.Entity.Conductor;
import com.app.BusApplication.service.ConductorService;



@RestController
@RequestMapping("/conductor")
public class ConductorController {
	@Autowired
	private ConductorService conductorService;
	

	Logger logger=LoggerFactory.getLogger(BusController.class);
	

	@PostMapping(value ="/add")
	public ResponseEntity<Conductor>addConductor(@RequestBody Conductor conductor){
		return new ResponseEntity<Conductor>(conductorService.addConductor(conductor),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getById")
	public ResponseEntity<Conductor> getById(@RequestParam int id){
		return new ResponseEntity<Conductor>(conductorService.getById(id),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getList")
	public ResponseEntity <List<Conductor>> getList(){
		return new ResponseEntity<List<Conductor>>(conductorService.getList(),HttpStatus.OK);
	}
	
	@PutMapping(value="/update")
	public ResponseEntity<Conductor> update(@RequestParam int id,@RequestBody Conductor conductor){
		return new ResponseEntity<Conductor>(conductorService.update(id,conductor),HttpStatus.OK);
	}
	
	@DeleteMapping(value="/delete")
	public ResponseEntity<String> delete(@RequestParam int id){
		conductorService.delete(id);
		return new ResponseEntity<String>("conductor record deleted sucessfully....",HttpStatus.OK);
	}

	
	

}
