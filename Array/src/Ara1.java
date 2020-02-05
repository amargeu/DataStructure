import java.util.Scanner;

public class Ara1 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("pls enter the length of ana array");
	int length=sc.nextInt();
	int arr[]=new int[length];
	System.out.println("insert the element in an array");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("print th array");
	for (int i = 0; i <arr.length; i++)
	{
		System.out.println(i+" ------>"+arr[i]);
		
	}
	System.out.println("reverse order of inserted array is: ");
	int k=0;
	 for (int i=arr.length-1; i>=0; i--)
	 {
	
		 int b=arr[i];
		 System.out.println(k+"---->"+b);
		 k++;
		
	}
	
		
		
	}

}
