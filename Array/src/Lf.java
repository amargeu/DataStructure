import java.util.Scanner;

public class Lf 
{
	public static void main(String[] args)
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("pls enter n ");
	int n=sc.nextInt();
	 int sp=n/2,st=1;
	 for (int i = 1; i <=n; i++)
	 {    
			 for (int j = 1; j <=n-i ; j++) 
			 {
				System.out.print(" ");
		
			  }
			 int k=1;
		   for (int j =1; j <=2*i-1; j++) 
		     {
			   System.out.print(k+"");
			   if(j<i)
			   {
				 k++;
			   }
			   else 
				   k--;
		     }
		   if(i<=n/2)
		   {
			   sp--;
			   st=st+1;
	
		   }
		   else
		   {
			   sp++;
			   st--;
			 
		   }
		   System.out.println();
	 }

}
}
