package practice;

import java.util.Arrays;

public class SortString
{
	public static void main(String[] args) {
		
	
	String str="amardeep kumar";
	char ch[]=str.toCharArray();
	Arrays.sort(ch);
	 str=new String(ch);
	System.out.println(str);
	}

}
