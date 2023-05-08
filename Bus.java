package com.app.BusApplication.Entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int b_id;
	private int b_number;
	private String b_from;
	private String b_to;
	LocalDateTime dateTime=LocalDateTime.now();
	private int trip;
	private String city;
	public int getId() {
		return b_id;
	}
	public void setId(int id) {
		this.b_id = id;
	}
	public int getB_number() {
		return b_number;
	}
	public void setB_number(int b_number) {
		this.b_number = b_number;
	}
	public String getB_from() {
		return b_from;
	}
	public void setB_from(String b_from) {
		this.b_from = b_from;
	}
	public String getB_to() {
		return b_to;
	}
	public void setB_to(String b_to) {
		this.b_to = b_to;
	}
	
	public int getTrip() {
		return trip;
	}
	public void setTrip(int trip) {
		this.trip = trip;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
	public Bus() {
		super();
	}
	
	
	public Bus(int id, int b_number, String b_from, String b_to, DateTimeFormatter format, LocalDateTime dateTime,
			int trip) {
		super();
		this.b_id = id;
		this.b_number = b_number;
		this.b_from = b_from;
		this.b_to = b_to;
		this.dateTime = dateTime;
		this.trip = trip;
	}
	@Override
	public String toString() {
		return "Bus [b_id=" + b_id + ", b_number=" + b_number + ", b_from=" + b_from + ", b_to=" + b_to + ", dateTime="
				+ dateTime + ", trip=" + trip + ", city=" + city + "]";
	}
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Bus(int b_id, int b_number, String b_from, String b_to, LocalDateTime dateTime, int trip, String city) {
		super();
		this.b_id = b_id;
		this.b_number = b_number;
		this.b_from = b_from;
		this.b_to = b_to;
		this.dateTime = dateTime;
		this.trip = trip;
		this.city = city;
	}
	
	
}
