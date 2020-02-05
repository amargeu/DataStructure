package practice;

public class ArrayRemoveDuplicate2 
{
	public static void main(String[] args) 
	{
		int arr[]= {4,9,6,5,2,1,9,3,2};
		for (int i = 0; i < arr.length; i++) 
		    {
			System.out.print(arr[i]+" ");
		    }
		for (int i = 0; i < arr.length; i++) 
		{
		   if(arr[i]!=-1)
		   {
			 int count=1;
			 for (int j=i+1; j < arr.length;j++)
			 {
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			 }
			 if(count<=1)
			 {
				 System.out.println("");
				System.out.print(arr[i]+" ");
			 }
			
		  }
		}
	}
}
