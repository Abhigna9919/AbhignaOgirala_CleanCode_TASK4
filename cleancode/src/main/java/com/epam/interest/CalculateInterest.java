package com.epam.interest;

public abstract class CalculateInterest 
{ 
  double rate,years,amount;
  CalculateInterest(double rate,double amount,double years)
  {
	  this.rate=rate;
	  this.years=years;
	  this.amount=amount;
  }
  public abstract String calculate();
}
