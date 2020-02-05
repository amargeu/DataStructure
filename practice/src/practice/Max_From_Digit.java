package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Max_From_Digit 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=""+n;
		char ch[]=st.toCharArray();
		Arrays.sort(ch);
		int max=0;
		for (int i = ch.length-1; i>=0; i--) 
		{
			max=max*10+(ch[i]-48);
			
		}
		System.out.print(max);
	}

}
