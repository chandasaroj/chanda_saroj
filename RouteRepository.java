package com.app.BusApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.BusApplication.Entity.Route;

@Repository
public interface RouteRepository extends CrudRepository<Route, Integer>{
	
}
