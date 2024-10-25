package com.suchiit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.suchiit.entity.Customer;
import com.suchiit.entity.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {


	@Query("select l from Loan l where l.id=?1")
	Customer findByCustomerId(int custId);
}
