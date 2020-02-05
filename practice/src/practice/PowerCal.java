package practice;

import java.util.Scanner;

public class PowerCal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter base");
		int n=sc.nextInt();
		System.out.println("pls enter exponent");
		int p=sc.nextInt();
		int rs=pow(n,p);
		System.out.println("power of"+n+"to the power"+p+" is:"+rs);
	}

	private static int pow(int n, int p) 
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}

}
