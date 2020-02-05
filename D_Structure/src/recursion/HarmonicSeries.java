package recursion;

import java.util.Scanner;

public class HarmonicSeries 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		double n=sc.nextDouble();
		System.out.println(Harmonic(n));
	}

	private static double Harmonic(double n)
	{
		double sum=0;
		if(n>0)
		{
			for (double i = 1; i < n; i++) 
			{
				sum=sum+1/i;
			}
		}
		else
			System.out.println("invalid user input");
		
		return sum;
	}

}
