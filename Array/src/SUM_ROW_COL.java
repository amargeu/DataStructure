
public class SUM_ROW_COL
{
	public static void main(String[] args) 
	{
		int ar[][]= {{6,3,6},{8,5,3},{5,5,6}};
		display(ar);
		row_sum(ar);
		col_sum(ar);
		
		
	}

  private static void row_sum(int[][] ar) 
  {
   int r_sum=0;
   for (int i = 0; i < ar.length; i++)
   {
	   for (int j = 0; j < ar[0].length; j++) 
	   {
		r_sum=r_sum+ar[i][j];
	    }
	   System.out.println("sum of "+(i+1)+" row is: "+r_sum);
	   r_sum=0;
	
   }
		
	}

private static void col_sum(int[][] ar)
  {
	 int c_sum=0;
	   for (int i = 0; i < ar.length; i++)
	   {
		   for (int j = 0; j < ar[0].length; j++) 
		   {
			c_sum=c_sum+ar[j][i];
		    }
		   System.out.println("sum of "+(i+1)+" col is: "+c_sum);
		   c_sum=0;
		
	   }
			
		
	}

static void display(int ar[][])
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
	
	




}
