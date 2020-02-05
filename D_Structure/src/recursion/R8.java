package recursion;

import java.util.Scanner;

public class R8 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int ar[]= {4,5,8,2,4,9,6};
		System.out.println("pls enter element : ");
		int ele=sc.nextInt();
		int in=search(ar,ele,0);
		if(in>=0)
		{
		System.out.println("serching element "+ele+" is at index "+in);
		}
		else
		System.out.println("searching element is not present");
		
	}

	private static int search(int[] ar, int ele, int i) 
	{
		if(i>=ar.length)
		return -1;
		if(ele==ar[i])
			return i;
		
		return search(ar,ele,i+1);
	}

}
