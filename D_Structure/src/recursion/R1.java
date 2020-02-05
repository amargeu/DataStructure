package recursion;

import java.util.Scanner;

public class R1 
{
	public static void main(String[] args)
	{
		System.out.println("pls enter range");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);
		
		
	}

	private static void print(int n) 
	{
		System.out.print(n+" ");
		if(n>1)
			print(n-1);
	}

}
