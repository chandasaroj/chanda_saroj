package com.app.Sbibank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Sbibank.dto.Payment;
import com.app.Sbibank.dto.PaymentRes;
import com.app.Sbibank.service.BankService;

@RestController
@RequestMapping("bank")
public class BankController {
	@Autowired
	private BankService bankService;
	
	@PostMapping("/payment")
	public ResponseEntity<PaymentRes> addPayment(@RequestBody Payment payment){
		return new ResponseEntity<PaymentRes>(bankService.addPayment(payment),HttpStatus.OK);
	}
}
