package recursion;

import java.util.Scanner;

public class R9_1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter number");
		int n=sc.nextInt();
		int rev=reverse(n,0);
		System.out.println(rev);
		
	}

	private static int reverse(int n, int rv) 
	{
		if(n==0)
			return rv;
		rv=rv*10+n%10;
		return reverse(n/10,rv);
	}

}
