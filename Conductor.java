package com.app.BusApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity

public class Conductor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_id;
	private String c_name;
	private long mob_num;
	private int trip;
	public int getId() {
		return c_id;
	}
	public void setId(int id) {
		this.c_id = id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public long getMob_num() {
		return mob_num;
	}
	public void setMob_num(long mob_num) {
		this.mob_num = mob_num;
	}
	public Conductor(int id, String c_name, long mob_num) {
		super();
		this.c_id = id;
		this.c_name = c_name;
		this.mob_num = mob_num;
	}
	
	@Override
	public String toString() {
		return "Conductor [c_id=" + c_id + ", c_name=" + c_name + ", mob_num=" + mob_num + ", trip=" + trip + "]";
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getTrip() {
		return trip;
	}
	public void setTrip(int trip) {
		this.trip = trip;
	}
	public Conductor(int c_id, String c_name, long mob_num, int trip) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.mob_num = mob_num;
		this.trip = trip;
	}
	public Conductor() {
		super();
	}


}
