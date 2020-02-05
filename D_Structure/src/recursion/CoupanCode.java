package recursion;

import java.util.Scanner;

public class CoupanCode
{
	public static void main(String[] args) 
	{
		int count=0,dis=0;
		int number,val=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter the coupan number");
		number=sc.nextInt();
		boolean[] value=new boolean[number];
		while(dis<number)
		{
			val=(int) (Math.random()*number);
			count++;
			if(!value[val])
			{
				dis++;
				value[val]=true;
				System.out.println("the order number is "+val);
			}
			
		}
		System.out.println("total random no to be distinct number..."+count);
	}
	static int getCoupan(int n)
	{
		return (int) (Math.random()*n);
	}

}
