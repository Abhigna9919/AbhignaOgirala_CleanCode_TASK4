package com.epam.interest;

import java.io.*;
import java.util.Scanner;

public class App 
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
			try 
			{
			bw.write("Enter Principle Amount=\n ");
			double amount=sc.nextDouble();
			bw.write("Enter years=\n");
			double years=sc.nextDouble();
			bw.write("Enter rate of Interest=\n");
			double rate=sc.nextDouble();
			CalculateInterest si= new SimpleInterest(rate,years,amount);
			CalculateInterest ci= new CompoundInterest(rate,years,amount);
			bw.write("SimpleInterest ="+si.calculate()+"\n");
			bw.write("CompoundInterest ="+ci.calculate()+"\n");
			sc.close();
			}
	        catch (IOException e) 
			{
	       	e.printStackTrace();
	        }
		}
}

