package com.app.BusApplication.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.BusApplication.Entity.Bus;
import com.app.BusApplication.repository.BusRepository;


@Service
public class BusService {
	@Autowired
	private BusRepository busRepo;

	public Bus addBus(Bus bus) {
		return busRepo.save(bus);
	}
	

	public Bus getById(int id) {
		return busRepo.findById(id).get();
	}
	/*
	public List<Bus> addBus(Bus bus) {
		List<Bus> response=new ArrayList<Bus>();
		Bus b=null;
		for(Bus bs:bus) {
			b=new Bus();
			b=busRepo.save(bs);
			response.add(b);
		}
			
		return response;
	}
*/
	



	public List<Bus> getList() {	
		return (List<Bus>) busRepo.findAll();
	}

	public Bus update(int id, Bus bus) {
		
		Bus b=busRepo.findById(id).get();
		Bus b1=null;
		if(b!=null) {
			b.setB_number(bus.getB_number());
			b.setB_to(bus.getB_to());
			b.setB_from(bus.getB_from());
			b.setDateTime(bus.getDateTime());
			busRepo.save(b);
		}
		return b1;
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
			busRepo.deleteById(id);
	}

	
}
