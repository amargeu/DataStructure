package recursion;

import java.util.Scanner;

public class R7
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter number");
		int n=sc.nextInt();
		int rs=fib(n);
		System.out.println(n+"th fibbonacci number is : "+rs);
	}

	private static int fib(int n) 
	{
		if(n==1)
			return 0;
		if(n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}

	

}
