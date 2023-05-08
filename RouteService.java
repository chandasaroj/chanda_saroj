package com.app.BusApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.BusApplication.Entity.Route;
import com.app.BusApplication.repository.RouteRepository;

@Service
public class RouteService {
	@Autowired
	private RouteRepository routeRepo;


	public Route addRoute(Route route) {
		return routeRepo.save(route);
	}


	public Route getById(int id) {
		return routeRepo.findById(id).get();
	}


	public List<Route> getList() {
		// TODO Auto-generated method stub
		return (List<Route>) routeRepo.findAll();
	}


	public Route update(int id, Route route) {
			Route r=routeRepo.findById(id).get();
			Route r1=null;
			if(r!=null) {
				r.setR_name(route.getR_name());
				routeRepo.save(r);
			}
			return r1;
		
	}


	public void delete(int id) {
		routeRepo.deleteById(id);
		
	}

}
