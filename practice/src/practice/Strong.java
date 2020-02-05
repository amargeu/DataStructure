package practice;

import java.util.Scanner;

public class Strong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("pls enter no.");
		//int n=sc.nextInt();
		for (int i =100; i <=40585; i++)
		{
		boolean rs=isStrong(i);
		if(rs)
			System.out.println(i);
		}
	
	}

	private static boolean isStrong(int n) 
	{
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+fact(rem);
			n=n/10;
		}
		return temp==sum;
	}

	private static int fact(int rem)
	{
		int fact=1;
		while(rem>0)
		{
			fact=fact*rem;
			rem--;
		}
		return fact;
	}
		
		
}

