package com.app.BusApplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int r_id;
	private String r_name;
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	@Override
	public String toString() {
		return "Route [r_id=" + r_id + ", r_name=" + r_name + "]";
	}
	public Route(int r_id, String r_name) {
		super();
		this.r_id = r_id;
		this.r_name = r_name;
	}
	public Route() {
		super();
	}
	
}
