package practice;

public class ArrayRemoveDuplicate 
{
	public static void main(String[] args) 
	{
		int arr[]= {4,9,6,5,2,1,9,3,2};
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("duplicate element");
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
		 if(arr[i]!=-1)
		 {
			 int count=1;
			 for (int j =i+1; j < arr.length; j++)
			 {
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=-1;
				}
			}
			 System.out.println(arr[i]+"    "+count);
			 if(count<=1)
				 sum=sum+arr[i];
		 }
		 }
		 System.out.println("sum of element which are not duplicate : "+sum);
	}

}
