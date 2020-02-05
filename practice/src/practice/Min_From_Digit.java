package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Min_From_Digit 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String st=""+n;
		char ch[]=st.toCharArray();
		Arrays.sort(ch);
		int min=0;
		for (int i = 0; i < ch.length; i++) 
		{
			int zc=0;
			while(i<ch.length && ch[i]=='0')
			{
				zc++;
				i++;
			}
			min=min*10+(ch[i]-48);
			while(zc>0)
			{
				min=min*10;
				zc--;
			}
			
		}
		System.out.print(min);
	}

}
