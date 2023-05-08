package com.app.BusApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.BusApplication.Entity.Conductor;

@Repository
public interface ConductorRepository extends CrudRepository<Conductor, Integer> {

}
