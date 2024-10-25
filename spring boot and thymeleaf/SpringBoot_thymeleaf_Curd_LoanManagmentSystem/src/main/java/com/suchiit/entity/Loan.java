package com.suchiit.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private double loanAmt;
	private String loanType;
	private int duration;
	private double monthlyEMI;

	
	  @ManyToOne
	  @JoinColumn(name = "id", insertable = false, updatable = false) private
	  Customer customer;
	 
		/*
		 * @OneToMany(mappedBy = "loan", cascade = CascadeType.ALL, fetch =
		 * FetchType.LAZY) private List<Transaction> transactions = new
		 * ArrayList<Transaction>();
		 */
}
