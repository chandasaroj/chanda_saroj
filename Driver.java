package com.app.BusApplication.Entity;

public class Driver {
	private int id;
	private String d_name;
	private long mob_num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public long getMob_num() {
		return mob_num;
	}
	public void setMob_num(long mob_num) {
		this.mob_num = mob_num;
	}
	public Driver(int id, String d_name, long mob_num) {
		super();
		this.id = id;
		this.d_name = d_name;
		this.mob_num = mob_num;
	}
	@Override
	public String toString() {
		return "Driver [id=" + id + ", d_name=" + d_name + ", mob_num=" + mob_num + "]";
	}
	public Driver() {
		super();
	}
	
}
