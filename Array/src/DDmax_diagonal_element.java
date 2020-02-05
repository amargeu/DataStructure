
public class DDmax_diagonal_element 
{
	public static void main(String[] args) 
	{
			int ar[][]= {{6,45,6},{8,74,3},{5,5,6}};
			display(ar);
			int max=max_diagonal(ar);
			int min=min_diagonal(ar);
			System.out.println("max element in 1st diagonal:"+max);
			System.out.println("min element in 1st diagonal:"+min);
			
		
	}
		private static int min_diagonal(int[][] ar)
		{
			int small=ar[0][0];
	       for (int i = 0; i < ar.length; i++)
	       {
	    	   for (int j = 0; j < ar[i].length; j++)
	    	   {
	    		   if(i==j)
	    		   {
	    			   if(small>ar[i][j])
	    			       small=ar[i][j];
	    			   
	    		   }
				
			   }
			
		}
		return small;
	    }
		private static int max_diagonal(int[][] ar) 
		{
			int big=ar[0][0];
		       for (int i = 0; i < ar.length; i++)
		       {
		    	   for (int j = 0; j < ar[i].length; j++)
		    	   {
		    		   if(i==j)
		    		   {
		    			   if(big<ar[i][j])
		    			       big=ar[i][j];
		    			   
		    		   }
					
				   }
				
			}
			return big;
	
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
