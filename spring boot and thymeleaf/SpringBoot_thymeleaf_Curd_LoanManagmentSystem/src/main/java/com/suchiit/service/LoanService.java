package com.suchiit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.entity.Loan;

import com.suchiit.repo.LoanRepository;

@Service
public class LoanService {

	@Autowired
	private LoanRepository loanrepo;
	
	public void save(Loan loan) {
	loanrepo.save(loan);
	}
	
	public List<Loan>getAllLoan(){
		return loanrepo.findAll();
	}
}
