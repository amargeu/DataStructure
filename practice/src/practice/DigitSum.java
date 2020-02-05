package practice;

public class DigitSum 
{
	public static void main(String[] args)
	{
		int n=5466542;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			System.out.println(rem);
		 sum=sum+rem;
		 n=n/10;
			
		}
		System.out.println(sum);
	}

}
