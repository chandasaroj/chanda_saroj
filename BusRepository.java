package com.app.BusApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.BusApplication.Entity.Bus;
@Repository
public interface BusRepository extends CrudRepository<Bus, Integer>{

}
