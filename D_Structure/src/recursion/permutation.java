package recursion;

import java.util.Scanner;

public class permutation 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter the string ");
		String str=sc.next();
		int n=str.length();
		permt(str,0,n-1);
	}
	private static void permt(String str, int l, int r) 
	{
		if(l==r)
			System.out.println(str);
		else
		{
			for (int i = l; i <=r; i++)
			{
				str=swap(str,l,i);
				permt(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	private static String swap(String a, int i, int j) 
	{
		char temp;
		char[]ch=a.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
	}

}
