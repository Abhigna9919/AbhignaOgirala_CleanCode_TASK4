package com.epam.construction;

import java.io.*;
import java.util.*;

public class CalculateCost
{
	public static void main(String[] args) 
	{
		String auto;
		double sqft;
		int material;
		Scanner sc=new Scanner(System.in);
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		try 
		{
		 bw.write("Type the area of the house in square feet:\n");
		sqft=sc.nextDouble();
		bw.write("Choose a material from below:\n");
		bw.write("1.Standard \n");
		bw.write("2.Above Standard \n ");
		bw.write("3.Highly Standard \n");
		material=sc.nextInt();
		bw.write("Do you wish for a fully automated home?\n");
		bw.write("Type YES or N0 \n");
		auto=sc.nextLine();
		Construct c=new Construct(sqft,material,auto);
		bw.write("Total Cost= "+c.findCost()+" Rupees\n");
		sc.close();
	    }	
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
