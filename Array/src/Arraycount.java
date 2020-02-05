import java.util.Scanner;

public class Arraycount 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("how many element u want to store in arrray");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("pls enter"+n+"element in array");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int count=countpaldr(arr);
		System.out.println("pallindrome element in an array:"+count);	
	}

	public static int countpaldr(int[] arr)
	{
		int count=0;
		for (int i = 0; i < arr.length; i++)
		{    
			if(pallindrome(arr[i]))
			{
				System.out.println("pallindrome element :"+arr[i]);
			count++;
			}
			
		}
		return count;
	}

	public static boolean pallindrome(int arr) 
	{
		int temp=arr;
		int rev=0;
		while(arr!=0)
		{
	      int rem=arr%10;
	      rev=rev*10+rem;
	      arr=arr/10;
		}
      return rev==temp; 
	
    }
}

