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


import com.app.BusApplication.Entity.Route;
import com.app.BusApplication.service.RouteService;

@RestController
@RequestMapping("route")
public class RouteController {
	@Autowired
	private RouteService routeService;
	

	Logger logger=LoggerFactory.getLogger(BusController.class);
	
	@PostMapping(value ="/add")
	public ResponseEntity<Route>addRoute(@RequestBody Route route){
		return new ResponseEntity<Route>(routeService.addRoute(route),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getById")
	public ResponseEntity<Route> getById(@RequestParam int id){
		return new ResponseEntity<Route>(routeService.getById(id),HttpStatus.OK);
	}
	
	@GetMapping(value = "/getList")
	public ResponseEntity <List<Route>> getList(){
		return new ResponseEntity<List<Route>>(routeService.getList(),HttpStatus.OK);
	}
	@PutMapping(value="/update")
	public ResponseEntity<Route> update(@RequestParam int id,@RequestBody Route route){
		return new ResponseEntity<Route>(routeService.update(id,route),HttpStatus.OK);
	}
	@DeleteMapping(value="/delete")
	public ResponseEntity<String> delete(@RequestParam int id){
		routeService.delete(id);
		return new ResponseEntity<String>("driver record deleted sucessfully....",HttpStatus.OK);
	}
}
