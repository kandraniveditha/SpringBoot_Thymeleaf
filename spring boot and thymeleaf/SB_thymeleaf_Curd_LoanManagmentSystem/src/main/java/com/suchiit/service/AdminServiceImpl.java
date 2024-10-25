package com.suchiit.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.entity.Admin;


@Service
@Transactional
public class AdminServiceImpl {

	@Autowired
	EntityManager adminEmanager;
	
	private static List<Admin>admin=new ArrayList<Admin>();
	private static int admincount=5;
	
	public List<Admin>getAllAdmi(){
			String jpql="SELECT c Admin c";
			TypedQuery<Admin> query=adminEmanager.createQuery(jpql,Admin.class);
			
		return query.getResultList();	
	}
	
	public void addAdmin(Admin admin) {
		adminEmanager.persist(admin);
	}
	
	public void deleteAdmin(int id) {
		Admin admin=adminEmanager.find(Admin.class,id);
		adminEmanager.remove(admin);
	}
	
	public void updateadmin(Admin admin) {
		adminEmanager.persist(admin);
	}
	
	public Admin viewAdminUpdate(int id) {
		return adminEmanager.find(Admin.class,id);
	}
	
	public Admin viewsearchAdmin(int id) {
		return adminEmanager.find(Admin.class,id);
	}
	
	public Admin login(String email,String password) {
		
		String jpql="SELECT c FROM Admin c";
		TypedQuery<Admin>query=adminEmanager.createQuery(jpql,Admin.class);
		
		List<Admin>admlist=query.getResultList();
		for(Admin admin:admlist) {
			if(admin.getEmail().equals(email)) {
				if(admin.getPassword().equals(password)) {
					
					return admin;
				}
				break;
			}
		}
		return null;
	}
}
