package recursion;

import java.util.Scanner;

public class R10_1 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter number");
		int n=sc.nextInt();
		boolean res=isperfect(n,0,1);
		System.out.println(res);
		
		
		
	}

	private static boolean isperfect(int n,int sum, int i)
	{
	
		if(i>n/2)
			return n==sum;
		if(n%i==0)
		 sum=sum+i;
		 return isperfect(n,sum,i+1);
		
	}

}
