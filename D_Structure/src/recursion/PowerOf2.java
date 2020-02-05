package recursion;

import java.util.Scanner;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		/*Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();*/
		int n=Integer.parseInt("5");
		if(n>0&&n<32)
		{
			for(int i=0;i<=n;i++)
				System.out.println(i+" "+Math.pow(2, i));
		}
		else
			System.out.println("overflow");
		//sc.close();
		
	}

}
