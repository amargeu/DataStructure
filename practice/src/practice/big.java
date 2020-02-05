package practice;

import java.util.Scanner;

public class big 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter three no.");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int b=biggest(x,y,z);
		System.out.println(b);
	}

	private static int biggest(int x, int y, int z)
	{
		int big=(x>y&&x>z)?x:(y>z)?y:z;
		return big;
	}

}
