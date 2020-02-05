import java.util.Scanner;

public class str5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter string");
		String str=sc.nextLine();
		boolean rs=isPallindrome(str);
		char[] rev=isreverse(str);
		for (int i = 0; i < rev.length; i++) {
			
		System.out.println("reverse string is:"+rev[i]);
		}
		if(rs)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
		
	}

	private static char[] isreverse(String str) 
	{
		int n=str.length();
		char rev[]=new char[n];
		for (int i = 0; i < str.length(); i++)
		{
			char ch=str.charAt(n-i-1);
			rev[i]=ch;
			
		}
		return rev ;
	}

	private static boolean isPallindrome(String str) 
	{
		int n=str.length();
		System.out.println(n);
	   for (int i = 0; i <=n/2; i++) 
	   {
		   System.out.println(i+"------>"+str.charAt(i));
		   System.out.println(i+"------>"+str.charAt(n-i-1));
		   if(str.charAt(i)!=str.charAt(n-i-1))
		   {
			 return false;  
		   }
		   
	   } 
		return true;
	}

}
