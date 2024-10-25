package com.suchiit.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.suchiit.entity.CustomerEntity;

@Service
@Transactional
public class CustomerServiceImpl {

	EntityManager customerEmanager;
	private static List<CustomerEntity>customer=new ArrayList<CustomerEntity>();
	private static int custcount=5;
	public List<CustomerEntity>getAllCustomer(){
		String jpql="SELECT c From CustomerEntity c";
		TypedQuery<CustomerEntity> query=customerEmanager.createQuery(jpql,CustomerEntity.class);
		
		return query.getResultList();
		
	}
	public void addCustomer(CustomerEntity cust) {
		customerEmanager.persist(customer);
	}
	
	public void deleteCustomer(int id) {
		
		CustomerEntity customer=customerEmanager.find(CustomerEntity.class,id);
		customerEmanager.remove(customer);
	}
	
	
	public void update(CustomerEntity customer) {
		
		customerEmanager.merge(customer);
	}
	public CustomerEntity viewCustomer(int id) {
		
		return customerEmanager.find(CustomerEntity.class,id);
	}
	
	
 public CustomerEntity SearchCustomerEntity(int id) {
	
	 return customerEmanager.find(CustomerEntity.class,id);
	 }
	
	public void Register(CustomerEntity regcust) {
	customerEmanager.persist(regcust);	
		
	}
	
	public CustomerEntity login(String email,String password) {
		
		String jpql="SELECT c From CustomerEntity c";
		TypedQuery<CustomerEntity>query=customerEmanager.createQuery(jpql,CustomerEntity.class);
		
		List<CustomerEntity>customerList=query.getResultList();
		for(CustomerEntity customer:customerList) {
			if(customer.getEmail().equals(email)) {
				if(customer.getPassword().equals(password)) {
					return customer;
				}
				break;
			}
		}
		return null;
	}
}
