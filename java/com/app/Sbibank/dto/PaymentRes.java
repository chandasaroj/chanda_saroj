package com.app.Sbibank.dto;

public class PaymentRes {
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
	return "PaymentRes [" + (payment != null ? "payment=" + payment + ", " : "")
			+ (status != null ? "status=" + status : "") + "]";
}

	

}
