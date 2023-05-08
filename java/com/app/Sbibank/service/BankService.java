package com.app.Sbibank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Sbibank.dto.Payment;
import com.app.Sbibank.dto.PaymentRes;
import com.app.Sbibank.model.Account;
import com.app.Sbibank.repository.BankRepo;

@Service
public class BankService {
	@Autowired
	private BankRepo bankRepo;

	public PaymentRes addPayment(Payment payment) {
		Account account=new Account();
		account.setAccountHolderName(payment.getAccountHolderName());
		account.setAccountNo(payment.getAccNo());
		account.setBalance(payment.getBalance());
		account.setBankName(payment.getBankName());
		Account acc=bankRepo.save(account);
		PaymentRes res=new PaymentRes();
		if(acc!=null) {
			res.setPayment(payment);
			res.setStatus("Success");
		}else {
			res.setPayment(payment);
			res.setStatus("Fail");
		}
		
		return res;
	}
}
