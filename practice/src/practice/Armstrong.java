package practice;

import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter number");
		int n=sc.nextInt();
		int temp=n,sum=0;
		do
		{
			 int rem=n%10;
			 sum=sum+rem*rem*rem;
			 n=n/10;
		}while(n!=0);
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("not Armstrong");
		
		
	}

}
