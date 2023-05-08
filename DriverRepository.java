package com.app.BusApplication.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.BusApplication.Entity.Driver;
@Repository
public interface DriverRepository extends CrudRepository<Driver, Integer> {

}
