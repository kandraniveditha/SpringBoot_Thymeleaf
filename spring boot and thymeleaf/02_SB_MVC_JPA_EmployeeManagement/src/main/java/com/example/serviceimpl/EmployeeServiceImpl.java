package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.EmployeeEntity;
import com.example.model.Employee;
import com.example.repo.EmployeeRepo;
import com.example.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo daoImpl;
	
	@Override
	public boolean saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		//to store the data into the data base -entity data
		EmployeeEntity empEn =new EmployeeEntity();
		empEn.setEno(emp.getEno());
		empEn.setEname(emp.getEname());
		empEn.setEadd(emp.getEadd());
		
		EmployeeEntity savedEn = daoImpl.save(empEn);
		
		if(savedEn!=null) 
			flag=true;
		
		return flag;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		
		List<EmployeeEntity> empDetails=daoImpl.findAll();
		
		List<Employee>empadd=new ArrayList<Employee>();
		for(EmployeeEntity empEn :empDetails) {
			Employee emp = new Employee();
			emp.setEno(empEn.getEno());
			emp.setEname(empEn.getEname());
			emp.setEadd(empEn.getEadd());
			
			empadd.add(emp);	
		}
		return empadd;
	}

}
