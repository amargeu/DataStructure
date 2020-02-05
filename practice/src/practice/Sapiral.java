package practice;

import java.util.Scanner;

public class Sapiral
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter the row and col");
		int rw=sc.nextInt();
		int col=sc.nextInt();
		System.out.println("enter "+rw*col+" element in array");
		int ar[][]=new int[rw][col];
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				ar[i][j]=sc.nextInt();
				
			}
			System.out.println();
			
		}
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++) 
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
			
		}
		int n=ar.length;
		System.out.println(n);
		System.out.println("-----------------");
	   for (int i = 0,j=n-1; i < j; i++,j--) 
	    {
			for (int k=i ; k<j; k++)//1st row
				    System.out.print(ar[i][k]+" ");
			     for (int k = i; k < j; k++) //last col
				    System.out.print(ar[k][j]+" ");
			        for (int k = j; k > i; k--) //last row
			           System.out.print(ar[j][k]+" ");
			            for (int k = j; k > i; k--) //1st col
			               System.out.print(ar[k][i]+" ");
				
		}
	   if(n%2==1)
		  System.out.print(ar[n/2][n/2]);
		
	}

}
