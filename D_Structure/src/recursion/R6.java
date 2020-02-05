package recursion;

import java.util.Scanner;

public class R6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter number");//17
		int n=sc.nextInt();
	 boolean rs=isprime(n,2);
	 System.out.println(rs);
	
	}

	private static boolean isprime(int n, int i)
	{
		if(i>n/2)//2>8
		return true;
		
		if(n%i==0)
			return false;
		
		return isprime(n,i+1);
	}

	

}
