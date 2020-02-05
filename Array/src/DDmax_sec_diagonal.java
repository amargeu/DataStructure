public class DDmax_sec_diagonal 
{
public static void main(String[] args) 
	{
			int ar[][]= {{84,45,5},{8,15,4},{45,41,4}};
			display(ar);
			int max=max_diagonal(ar);
			int min=min_diagonal(ar);
			System.out.println("max element in 2nd diagonal:"+max);
			System.out.println("min element in 2nd diagonal:"+min);
			
		
	}
		private static int min_diagonal(int[][] ar)
		{
			int small=ar[0][ar[0].length-1];
	       for (int i = 0; i < ar.length; i++)
	       {
	    	   for (int j = 0; j < ar[i].length; j++)
	    	   {
	    		   if(i+j==ar.length-1)
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
			int big=ar[0][ar[0].length-1];
		       for (int i = 0; i < ar.length; i++)
		       {
		    	   for (int j = 0; j < ar[i].length; j++)
		    	   {
		    		   if(i+j==ar.length-1)
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
