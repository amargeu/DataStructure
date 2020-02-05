import java.util.Scanner;

public class array1 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("pls enter the length");
	int length=sc.nextInt();
	int arr[]=new int[length];
	System.out.println("enter array element");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
	System.out.println(i+"----->"+arr[i]);
	}

	for(int i=0;i<arr.length;i++)
	{
	
		for (int j = i+1; j < arr.length; j++) 
		{
		if(arr[j]==arr[i])
		{
		System.out.println("this is duplicate:"+arr[j]);
		}
		}
	}	

	
	
	
}

}
