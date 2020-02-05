package practice;

import java.util.Scanner;

public class UniqueCharString 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String st=sc.next();
	String rs="";
	for (int i = 0; i < st.length(); i++)
	{
		char ch=st.charAt(i);
		if(st.indexOf(ch)==st.lastIndexOf(ch))
			rs=rs+ch;
	}
		System.out.print(rs);
	}

}
