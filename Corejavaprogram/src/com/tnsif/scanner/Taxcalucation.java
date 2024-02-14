package com.tnsif.scanner;

public class Taxcalucation {
public void calucation(Person p) {
	if(p.getIncome()<=16000) {
		p.setTax(0);
	}
	else if(p.getIncome()>16000 && p.getIncome()<=70000) {
		p.setTax(5);
	}
	else
	{
		p.setTax(10);
	}
}
}
