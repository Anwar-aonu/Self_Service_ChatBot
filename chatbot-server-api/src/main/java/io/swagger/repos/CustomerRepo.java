package io.swagger.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Customer;


@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
	
	Customer findById(long custid);
	
	@Transactional
	@Modifying
	@Query("update Customer c set c.name = ?1, c.city = ?2 where c.id = ?3")
	void updateCustomer(String name, String city, Long id);
	
	//used for POST accounts -> /customer​/{customerId}​/account​/{accountId}​/balance
	@Transactional
	@Modifying
	@Query("update Customer c set c.balance = ?1 where c.id = ?2")
	void updateCustomerBalance(Long balance, Long id);

	//findCustomersByStatus
	List<Customer> findByStatus(List<String> status);
	
	//findCustomerByAccount
	List<Customer> findByAccount(String account);
}