package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EMPLOYEE")
public class EmployeeEntity {

	@Id
	@Column(name="ENO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eno;
	
	@Column(name="ENAME")
	private String ename;
	
	@Column(name="EADD")
	private String eadd;
}
