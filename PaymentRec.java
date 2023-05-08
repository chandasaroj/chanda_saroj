package com.app.BusApplication.dto;

public class PaymentRec {
	private Payment payment;
	private String status;
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "PaymentRec [payment=" + payment + ", status=" + status + "]";
	}
	
}
