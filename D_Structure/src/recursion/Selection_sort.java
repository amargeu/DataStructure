package recursion;

public class Selection_sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {4,9,3,6,8,5,12};
		  int n=ar.length;
		  System.out.println(n);
		  int i=0;
		  while(i<n-1)
		  {
			int min=i;
			  for (int j = i+1; j < n; j++)
			  {
				if( ar[j]<ar[min])
				 min=j;
			   }
			  int temp=ar[min];
			  ar[min]=ar[i];
			  ar[i]=temp;
			  i++;
			  System.out.println();
			  for (int j = 0; j < ar.length; j++) 
			  {
				System.out.print(ar[j]+" ");
			}
			
		    }
		  for (int j= 0; j< ar.length; j++) 
		  {		
		  System.out.print(ar[j]+" ");
		  }
		
	}

}
