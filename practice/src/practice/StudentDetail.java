package practice;

import java.util.Scanner;

public class StudentDetail 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter percentage throughout");
		double per=sc.nextDouble();
	System.out.println("pls enter the rating");
		int rate=sc.nextInt();
		VerifyRating v=new VerifyRating();
		v.verify(rate);
		v.verify(per);
		
		
	}

}
