package recursion;

import java.util.Scanner;

public class R_Street_Light 
{
	public static void main(String[] args)
	{
		System.out.println("pls enter the day which status you want to know");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//no.of day after status we want
		int a[]=new int[10];
		for (int i = 1; i <=8; i++) 
		{
			a[i]=sc.nextInt();
			
		}
		while(n>0)
		{
			int b[]=new int [10];
			for (int i =1; i <=8; i++) 
			{
				if(a[i-1]==a[i+1])
					b[i]=0;
				else
					b[i]=1;
				
			}
			a=b;
			n--;
		}
		for (int i = 1; i <=8; i++) 
		{
			System.out.print(a[i]+" ");
			
		}
		
	}

}
