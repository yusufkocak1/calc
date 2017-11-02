package com.yube;

public class contact {
   
	double number;
	char operator;
	public contact(double number, char operator) {
		super();
		
		this.number = number;
		this.operator = operator;
	}

	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	
	
}
