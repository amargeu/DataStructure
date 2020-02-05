package recursion;

import java.util.Scanner;

public class FlipCoin 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no. of time flip the coin");
		int n=sc.nextInt();
		int head=0;
		int tail=0;
		for (int i = 0; i < n; i++) 
		{
			if(Math.random()<0.5)
				head++;
			else
				tail++;	
		}
		System.out.println("head------"+head);
		System.out.println("tail-------"+tail);
		int hper=head*100/n;
		int tper=tail*100/n;
		System.out.println("head percentage: "+hper);
		System.out.println("tail percentage: "+tper);
		
	}

}
