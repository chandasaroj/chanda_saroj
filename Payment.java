package com.app.BusApplication.dto;

import java.time.LocalDateTime;

public class Payment {
	private int id;
	private int trans_Id;
	private String b_Name;
	private double balance;
	private int acc_No;
	private String account_Hname;
	private LocalDateTime localDateTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTrans_Id() {
		return trans_Id;
	}
	public void setTrans_Id(int trans_Id) {
		this.trans_Id = trans_Id;
	}
	public String getB_Name() {
		return b_Name;
	}
	public void setB_Name(String b_Name) {
		this.b_Name = b_Name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAcc_No() {
		return acc_No;
	}
	public void setAcc_No(int acc_No) {
		this.acc_No = acc_No;
	}
	public String getAccount_Hname() {
		return account_Hname;
	}
	public void setAccount_Hname(String account_Hname) {
		this.account_Hname = account_Hname;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	public Payment(int id, int trans_Id, String b_Name, double balance, int acc_No, String account_Hname,
			LocalDateTime localDateTime) {
		super();
		this.id = id;
		this.trans_Id = trans_Id;
		this.b_Name = b_Name;
		this.balance = balance;
		this.acc_No = acc_No;
		this.account_Hname = account_Hname;
		this.localDateTime = localDateTime;
	}
	public Payment() {
		super();
	}
	@Override
	public String toString() {
		return "Payment [id=" + id + ", trans_Id=" + trans_Id + ", b_Name=" + b_Name + ", balance=" + balance
				+ ", acc_No=" + acc_No + ", account_Hname=" + account_Hname + ", localDateTime=" + localDateTime + "]";
	}
	
}
