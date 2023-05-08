package com.app.BusApplication.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.BusApplication.Entity.Conductor;

import com.app.BusApplication.repository.ConductorRepository;


@Service
public class ConductorService {
	@Autowired
	private ConductorRepository conductorRepo;

	public Conductor addConductor(Conductor conductor) {
		return conductorRepo.save(conductor);
	}
	
	public Conductor getById(int id) {
		return conductorRepo.findById(id).get();
	}


	public List<Conductor> getList() {
		return (List<Conductor>) conductorRepo.findAll();
	}

	public Conductor update(int id, Conductor conductor) {
		Conductor c=conductorRepo.findById(id).get();
		Conductor c1=null;
		if(c!=null) {
			c.setC_name(conductor.getC_name());
			c.setMob_num(conductor.getMob_num());
			conductorRepo.save(c);
		}
		return c1;
	}

	public void delete(int id) {
		conductorRepo.deleteById(id);
		
	}



	
}
