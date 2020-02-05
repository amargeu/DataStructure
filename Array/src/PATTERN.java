
public class PATTERN
{
public static void main(String[] args)
{
	int n=7;
	for (int i = 0; i < n; i++) 
	{
		for (int j = 0; j < n; j++) 
		{
			if (i==0||j==0)
			{
				System.out.print("*");
			}
			if(i==n-1||j==n-1)
			{
				System.out.print("*");
			}
			if (i==n/2||j==n/2)
			{
				System.out.println("*");
				
			}
			
		}
		System.out.println();
		
		
	}
}

}
