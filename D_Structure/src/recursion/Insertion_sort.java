package recursion;

public class Insertion_sort
{
	public static void main(String[] args) 
	{
		int ar[]= {28,56,78,19,23,45};
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i]+" ");
		}
		inser_sort(ar);
		
	}

	private static void inser_sort(int[] ar) 
	{
		for (int i = 0; i < ar.length; i++) 
		{
			int t=ar[i];
			int j=i-1;
			while(j>=0&&ar[j]>t)
			{
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=t;
		 }
		System.out.println();
		for (int i = 0; i< ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
			
		}
		
	}

}
