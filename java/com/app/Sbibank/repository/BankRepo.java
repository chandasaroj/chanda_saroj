package com.app.Sbibank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Sbibank.model.Account;
@Repository
public interface BankRepo extends JpaRepository<Account, Long>{

}
