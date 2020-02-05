package recursion;

import java.util.Scanner;

public class Lyear 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter the year");
		int y=sc.nextInt();
		if(y>999&&y<10000)
			System.out.println(isLeapYear(y));
		else
			System.out.println("invalid year");
		sc.close();
		
	}

	private static boolean isLeapYear(int y)
	{
		if(y%400==0||(y%4==0&&y%100!=0))
				return true;
		else
		return false;
	}

}
