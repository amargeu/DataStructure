import java.util.Scanner;

public class str4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String1");
		String str1=sc.nextLine();
		System.out.println("enter the String2");
		String str2=sc.nextLine();
		boolean rs=isanagram(str1,str2);
		if(rs==true)
			System.out.println("string is anagram");
		else
			System.out.println("not anagram");
		
	}

	private static boolean isanagram(String str1,String str2) 
	{
		if(str1.length()!=str2.length())
		{
		System.out.println(str1.length());
		System.out.println(str2.length());
		}
	
		
		int count[]=new int[26];
		for (int i = 0; i < str1.length(); i++)
		{
		char ch=str1.charAt(i);
		if(ch>=65&ch<=90)
			count[ch-65]++;
		if(ch>=97&&ch<=122)
			count[ch-97]++;
		}
		for (int i = 0; i < str2.length(); i++)
		{
		char ch=str2.charAt(i);
		if(ch>=65&ch<=90)
			count[ch-65]--;
		if(ch>=97&&ch<=122)
			count[ch-97]--;
	
	    }
		for (int i = 0; i < count.length; i++)
		{
			if(count[i]!=0)
			return false;
		}
		return true;
		}
}
