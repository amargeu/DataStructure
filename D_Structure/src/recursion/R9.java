package recursion;

import java.util.Scanner;

public class R9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("pls enter number");
	int n=sc.nextInt();
	reverse(n);
	
	}

	private static void reverse(int n)
	{
		if(n<10)
		{
			System.out.print(n);
		}
		else
		{
			System.out.print(n%10);
	        reverse(n/10);
		}
	}

}
