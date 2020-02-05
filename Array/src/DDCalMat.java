import java.util.Scanner;

public class DDCalMat 
{
	 int[][] readMat()
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
		return ar;
	}
	void dispMat( int ar[][])
	{
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar[i].length; j++)
			{
				System.out.print(ar[i][j]+" ");
				
			}
			System.out.println();
			
		 }
	}
	int[][] add(int a[][],int b[][])
	{
		if(a.length!=b.length||a[0].length!=b[0].length)
			System.out.println("order not be the same");
		int c[][]=new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c[i].length; j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				
			}
			
		}
		return c;
	}
	int[][]trsnMat(int [][]ar)
	{
		int transar[][]=new int[ar[0].length][ar.length];
				for (int i = 0; i < ar.length; i++) 
				{
					for (int j = 0; j < ar[i].length; j++) 
					{
						transar[j][i]=ar[i][j];
				    }
				}
		return transar;
	}
	int getbiggest(int[][]x)
	{
		int big=x[0][0];
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				if(big<x[i][j])
					big=x[i][j];
				
			}
			
		}
		
		return big;
		
	}
	int getSmallest(int[][]x) 
	{
		int small=x[0][0];
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				if(small>x[i][j])
					small=x[i][j];
				
			}
			
		}
		
		return small;
		
	}
	public int[] countEo(int[][] x) 
	{
	  int c[]= {0,0};
	  for (int i = 0; i < x.length; i++) 
	  {
		  for (int j = 0; j < x[i].length; j++)
		  {
			c[x[i][j]%2]++;
		  }	
	}
		return c;
	}
	public int sumMat(int[][] x)
	{
		int sum=0;
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[0].length; j++)
			{
				sum=sum+x[i][j];	
			}
			
		}
	
		return sum;
	}
}
