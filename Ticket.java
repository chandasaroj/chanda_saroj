package com.app.BusApplication.dto;

import java.time.LocalDateTime;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String from;
	private String to;
	private int t_amt;
	LocalDateTime dateTime=LocalDateTime.now();
	//String ticketcode=generateTicketCode();
	
	
	public String getFrom() {
		return from;
	}
	/*
	private String generateTicketCode() {
		String code=UUID.randomUUID().toString().substring(0, 8);
		while(ticketRepo.findByCode(code)!=null)
			code=UUID.randomUUID().toString().substring(0, 8);
		return code;
	}*/
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getT_amt() {
		return t_amt;
	}
	public void setT_amt(int t_amt) {
		this.t_amt = t_amt;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	@Override
	public String toString() {
		return "Ticket [from=" + from + ", to=" + to + ", t_amt=" + t_amt + ", dateTime=" + dateTime + "]";
	}
	public Ticket(String from, String to, int t_amt, LocalDateTime dateTime) {
		super();
		this.from = from;
		this.to = to;
		this.t_amt = t_amt;
		this.dateTime = dateTime;
	}
	public Ticket() {
		super();
	}
	
}
