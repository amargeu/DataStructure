import java.util.Scanner;

public class str7 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter sentence");
		String str=sc.nextLine();
		String a[]=str.split(" ");
		String rev="";
		for (int i = 0; i < a.length; i++)
		{
	      String word=a[i];
		for (int j =word.length()-1; j>=0; j--)
		{
			rev=rev+word.charAt(j);
		}
		rev=rev+" ";
		}
		System.out.println(rev);

     }
}
