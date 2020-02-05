
public class p1 
{
public static void main(String[] args) 
{
for (int i = 1; i <= 5; i++)
{
	
	for (int j = 1; j <=i; j++)
	{
		if(i<=j)
		{
		System.out.print(2*i-1);
		i--;
		}
		if(i!=j)
			System.out.print("*");
		
	}
	System.out.println();
	
}
	
}

}
