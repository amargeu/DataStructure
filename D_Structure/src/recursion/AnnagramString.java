package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class AnnagramString 
{
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("pls enter the String");
	String st1=sc.nextLine();
	String st2=sc.nextLine();
	System.out.println(isAnnagram(st1,st2));
	
	}

	private static boolean isAnnagram(String str1, String str2)
	{
		if(str1.length()==str2.length())
		{
			char a[]=str1.toCharArray();
			char b[]=str2.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a, b))
				return true;
		}
		return false;
	}

	/*private static boolean isAnnagram(String str1, String str2)
	{
		if(str1.length()!=str2.length())
			return false;
	    int count[]=new int [26];
		for (int i = 0; i < str1.length(); i++)
		{
		char ch=str1.charAt(i);
		if(ch>=65&&ch<=90)
			count[ch-65]++;
		else if(ch>=97&&ch<=122)
			count[ch-97]++;
		}
		for (int i = 0; i < str2.length(); i++) 
		{
			char ch=str2.charAt(i);
			if(ch>=65&&ch<=90)
				count[ch-65]--;
			else if(ch>=97&&ch<=122)
				count[ch-97]--;
			
		}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
				return false;
			
		}
		
		
		return true;
	}*/

}
