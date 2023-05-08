package com.app.Sbibank.dto;


import java.time.LocalDateTime;

public class Payment {
	private int transId;
	private String bankName;
	private double balance;
	private int accNo;
	private String accountHolderName;
	private LocalDateTime localDateTime;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	@Override
	public String toString() {
		return "Payment [transId=" + transId + ", " + (bankName != null ? "bankName=" + bankName + ", " : "")
				+ "balance=" + balance + ", accNo=" + accNo + ", "
				+ (accountHolderName != null ? "accountHolderName=" + accountHolderName + ", " : "")
				+ (localDateTime != null ? "localDateTime=" + localDateTime : "") + "]";
	}

	

}
