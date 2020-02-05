package recursion;

import java.util.Scanner;

public class R3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter range");
		int n=sc.nextInt();
		int rs=sum(n);
		System.out.println(rs);
		
		
	}

	private static int sum(int n) 
	{
		if(n==1)
			return 1;
		
		return n+sum(n-1);
	
		
	}

}
