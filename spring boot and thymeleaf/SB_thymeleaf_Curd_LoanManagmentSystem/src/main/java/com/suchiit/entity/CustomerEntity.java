package com.suchiit.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	@NotBlank(message="Frist name is mandatory")
	private String fname;
	
	@NotBlank(message="Last name is mandatory")
	private String lname;
	
	@NotBlank(message="Email is mandatory")
	private  String email;
	
	@NotBlank(message="password is mandatory")
	private String password;
	
	@NotBlank(message="Date of birth is mandatory")
	private Date dob;
	
	@NotBlank(message="Phone number is mandatory")
	private String phonenum;
	
	@NotBlank(message="Gender is mandatory")
	private String gender;
	
	@NotBlank(message="MaritalStatus is mandatory")
	private String maritalstatus;
	
	@NotBlank(message="profession is mandatory")
	private String profession;
	
	@NotBlank(message="Address is mandatory")
	private String address;
}
