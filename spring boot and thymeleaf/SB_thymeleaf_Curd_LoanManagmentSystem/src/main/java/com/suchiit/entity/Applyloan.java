package com.suchiit.entity;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Applyloan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appid;
	private int cid;
	private int loanid;
	private double amount;
	private String pancard;
	private String addressproof;
	private String financialreport;
	private Date appdate;
	private String status;
}
