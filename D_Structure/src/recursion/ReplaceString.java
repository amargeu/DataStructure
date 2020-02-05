package recursion;

import java.util.Scanner;

public class ReplaceString
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String s1="Hello";
		String s3=" ,How are you";
		System.out.println("enter the user name");
		String s2=sc.next();
		if(s2.length()<3)
			System.out.println("username should be min of 3 Charecter");
		else
		System.out.println(s1+" "+s2+s3);
		
	}

}
