import java.util.Scanner;

public class DDarray1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter no.of rows and col:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		System.out.println("pls enter"+row*col+"element:");
		for (int i = 0; i < ar.length; i++)
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("display the matrix:");
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
			
			
		}
		
	}

}
