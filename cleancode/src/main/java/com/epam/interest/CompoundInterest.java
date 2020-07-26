package com.epam.interest;

public class CompoundInterest extends CalculateInterest
{
	CompoundInterest(double rate,double years, double amount)
	{
	super(rate,amount,years);
	}

	public String calculate() 
	{
		double interest=amount * Math.pow(1.0+rate/100.0,years) - amount;
		return(String.valueOf(interest));
	}

}
