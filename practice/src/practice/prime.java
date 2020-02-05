package practice;

import java.util.Scanner;

public class prime 
{
	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("pls enter range");
     int n=sc.nextInt() ;
     int ce=0,co=0,cp=0;
     for (int i =1; i <n; i++)
     {
    	 if(i==0)
    		 i++;
    boolean rs=isprime(i);
    boolean rs1=iseven(i);
    boolean rs2=isodd(i);
    if(rs)
    System.out.println(i);
    if(rs1)
    System.out.println(i);
    if(rs2)
    	System.out.println(i);
 
     }
		
	}

	private static boolean isodd(int i) 
	{
		if(i%2!=0)
		   return true;
		  else 
			return false;

	}

	private static boolean iseven(int i) 
	{
		if(i%2==0)
			return true;
		else
		   return false;
	}

	private static boolean isprime(int n)
	{
		int i=2;
		while(i<n/2)
		{
		if(n%i==0)
			return false;
		i++;
		}
		return true;
	}
	
	

}
