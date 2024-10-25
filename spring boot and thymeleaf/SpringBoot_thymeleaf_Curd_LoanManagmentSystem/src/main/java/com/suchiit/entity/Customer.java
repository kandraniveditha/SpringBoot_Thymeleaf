package com.suchiit.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private long phone;
	private String email;
	private String password;
	private String confirmPassword;
	private float salary;
	private long adhaar;
	private String pan;
	private double walletAmt;

	
	/*
	 * @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, fetch =
	 * FetchType.LAZY) private List<Loan> loans = new ArrayList<Loan>();
	 * 
	 * public List<Loan> getLoans() { return loans; }
	 * 
	 * public void setLoans(List<Loan> loans) { this.loans = loans; }
	 * 
	 * // the method below will add Loan to LoansList // also serves the purpose to
	 * public void addLoan(Loan loan) { loan.setCustomer(this); // this will avoid
	 * nested cascade this.getLoans().add(loan); }
	 */

}
