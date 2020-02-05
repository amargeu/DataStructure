package recursion;

import java.util.Scanner;

public class R5VVI
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter String");//java
		String st=sc.nextLine();
		print(st,1);
		
		
	}

	private static void print(String st, int i) 
	{
		
		if(i>st.length())
		    return;
		System.out.println(st);
		print(st,i+1);
		
	}

}
