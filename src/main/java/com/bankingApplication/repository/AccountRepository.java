package com.bankingApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApplication.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	
}
