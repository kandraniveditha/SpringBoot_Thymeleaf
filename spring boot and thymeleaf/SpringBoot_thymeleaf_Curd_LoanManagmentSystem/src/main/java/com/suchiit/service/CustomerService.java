package com.suchiit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.entity.Customer;
import com.suchiit.repo.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository custrepo;
	
	public void save(Customer customers) {
	custrepo.save(customers);
	}
	
	public List<Customer> getAllCustomer(){
		
		return custrepo.findAll();
	}
}
