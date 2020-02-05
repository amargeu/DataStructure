
public class DDArray 
{
	public static void main(String[] args)
	{
		int arr[][]= {{4,6,8,9},{4,8,6,6,5},{3,8,6}};
		System.out.println(arr);
		System.out.println(arr.length);
	  for (int i = 0; i < arr.length; i++)
	  {
	  for (int j = 0; j < arr[i].length; j++) 
		{
			System.out.print(arr[i][j]+" ");
		}
		  System.out.println();
	   }
	}

}
