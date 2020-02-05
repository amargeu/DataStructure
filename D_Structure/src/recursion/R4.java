package recursion;

import java.util.Scanner;

public class R4 
{
	
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("pls enter number");
			int n=sc.nextInt();
			int rs=fact(n);
			System.out.println(rs);
			
			
		}

		private static int fact(int n) 
		{
			if(n==0||n==1)
				return 1;
			
			return n*fact(n-1);
		
			
		}
		
	

}
