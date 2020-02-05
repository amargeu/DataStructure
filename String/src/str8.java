import java.util.Scanner;

public class str8
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("pls enter sentence");
		String str=sc.nextLine();
		String a[]=str.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
