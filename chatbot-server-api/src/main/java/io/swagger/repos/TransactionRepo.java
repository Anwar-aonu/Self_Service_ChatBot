package io.swagger.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Customer;

import io.swagger.model.Transaction;

@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Long> {
	
	List<Transaction> findByAccountId(Long accountId);	
	
}