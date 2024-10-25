package com.suchiit.repo;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	Page<Customer> findAll(Pageable pageable);

	@Query("select c from Customer c where c.email=?1 or c.adhaar=?2 or c.pan=?3 or c.phone=?4")
	Customer checkCustomer(String email, long adhaar, String pan, long phone);

	@Query("select c.id from Customer c where c.email=?1 and c.password=?2")
	Integer findCustomerByEmailAndPassword(String email, String password);

}
