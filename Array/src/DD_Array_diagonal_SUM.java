import java.util.Scanner;

public class DD_Array_diagonal_SUM
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter no.of rows and col:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		System.out.println("pls enter "+row*col+" element:");
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
		int sum_md=0;
		int sum_sd=0;
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				if(ar.length==ar[0].length)
				{
				   if(i==j)
				    {
				      sum_md=sum_md+ar[i][j];
				     }
				   if(i+j==ar.length-1)
				   {
					sum_sd=sum_sd+ar[i][j];
				   }
				}
				else
					System.out.println("not a square matrix");
			}
			
		}
		System.out.println("sum of main diagonal "+sum_md);
		System.out.println("sum of sec diagonal "+sum_sd);
	
		
	}

}
