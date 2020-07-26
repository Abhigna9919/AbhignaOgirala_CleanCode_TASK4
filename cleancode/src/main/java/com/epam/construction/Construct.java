package com.epam.construction;

public class Construct
{
	double sqft;
	int material;
	String auto;
	Construct(double sqft,int material,String auto)
	{
		this.sqft=sqft;
		this.material=material;
		this.auto=auto;
	}
	public double findCost()
	{
		double cost=0.0;
		if(material==1)
		{
			cost=sqft*1200;
		}
		else if(material==2)
		{
			cost=sqft*1500;
		}
		else if(material==3)
		{
			if(auto.equalsIgnoreCase("YES"))
			{
				cost=sqft*1800;
			}
			else
			{
				cost=sqft*2500;
			}
			
		}
		return cost;
	}
}
