package practice;

import java.util.Scanner;

public class fact
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter range");
		int n=sc.nextInt();
		for (int i =1; i <= n; i++) 
		{
		    int rs=fact(i);
		    System.out.println("factorial of "+i+ " is "+rs);
		}
		
		
	}

	private static int fact(int n) 
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		
		return fact;
	}

}
