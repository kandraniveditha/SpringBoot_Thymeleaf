package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee emp);
    public List<Employee> getAllEmployees();
}
