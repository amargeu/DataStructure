package practice;

import java.util.Random;
import java.util.Scanner;

public class random_num 
{
	public static void main(String[] args) 
	{
		Random rd=new Random();
		Scanner sc=new Scanner(System.in);
		int rn=rd.nextInt(100);
		while(true) 
		{
		System.out.println("pls guess no. b/w 0 to 99");
		int un=sc.nextInt();
		System.out.println(rn);
		if(un==rn)
		{
		System.out.println("ur guess is correct");
		break;
		}
		else if(un>rn)
			System.out.println("your guess is too high");
		else
			System.out.println("your guess is too low");
		}
	}

}
