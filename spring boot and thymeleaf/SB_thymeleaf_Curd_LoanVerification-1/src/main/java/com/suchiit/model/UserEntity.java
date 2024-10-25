package com.suchiit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotBlank(message="FirstName is Mandatory ")
	private String fname;
	
	@NotBlank(message="Lastname is Mandatory ")
	private String lname;
	
	@NotBlank(message="Email is Mandatory ")
	private String email;
	
	private String password;
	
	private String gender;

	private boolean maritalstatus;
	private String profession;
	private String address;
}
