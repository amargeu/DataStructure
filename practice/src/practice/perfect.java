package practice;

public class perfect 
{
	public static void main(String[] args) 
	{
	int n=55;
	int i=2;
	while(i<=n/2)
	{
		if(n%i==0)
		{
			System.out.println("not prime");
	    return;
		}
		i++;
		
	}

		System.out.println("prime");

}
}
