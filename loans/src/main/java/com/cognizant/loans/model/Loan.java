package com.cognizant.loans.model;

import lombok.Data;

@Data
public class Loan {

	private String number;
	private String type;
	private double loan;
	private double EMI;
	private int tenure;
}
