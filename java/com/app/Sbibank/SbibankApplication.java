package com.app.Sbibank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SbibankApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbibankApplication.class, args);
		Logger logger=LoggerFactory.getLogger(SbibankApplication.class);
		logger.info("wecome to SBI Bbank");
		
	}

}
