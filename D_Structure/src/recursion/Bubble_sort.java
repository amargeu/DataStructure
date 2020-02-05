package recursion;

public class Bubble_sort 
{
	public static void main(String[] args) 
	{
		int ar[]= {4,9,3,6,8,5,12};
		System.out.print("my unsorted array-----");
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i]+" ");
			
		}
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) 
		{
			for (int j = 0; j < ar.length-1-i; j++) 
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
		
			}
			System.out.println("---------");
			for (int j = 0; j < ar.length; j++) 
			{
				System.out.print(ar[j]+" ");
				
			}
		
			
		}
		System.out.println();
		System.out.println("after sorting perform---");
		for (int i = 0; i < ar.length; i++) 
		{
			System.out.print(ar[i]+"  ");
			
		}
		
		
	}

}
