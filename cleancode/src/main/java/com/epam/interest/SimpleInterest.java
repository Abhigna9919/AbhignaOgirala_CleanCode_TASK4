package com.epam.interest;

public class SimpleInterest extends CalculateInterest
{
	SimpleInterest(double rate,double years, double amount)
	{
	super(rate,amount,years);
	}

	public String calculate() 
	{
		double interest=(amount * years* rate)/100;
		return(String.valueOf(interest));
	}

}
