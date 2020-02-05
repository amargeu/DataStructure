package recursion;

import java.util.Scanner;

public class Distance 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int p=(int) (Math.pow(x, 2)+Math.pow(y, 2));
		 double distance=Math.sqrt(p);
		 System.out.println("distance: "+distance);
		
	}

}
