package recursion;

import java.util.Scanner;

public class R11
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter string");
		String st=sc.nextLine();
		boolean res=ispallindrome(st,0,st.length()-1);
		System.out.println(st.length());
		if(res)
			System.out.println("pallindrome");
		else
			System.out.println("not pallindrome");
		
	}

	private static boolean ispallindrome(String st, int i, int j)
	{
	    if(i>j)
	      return true;
	    
	    if(st.charAt(i)!=st.charAt(j))
		return false;
	
	    return ispallindrome(st, i+1, j-1);
	    
	    
	  
	}

}
