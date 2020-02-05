package practice;

public class pallindrome 
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int i = 100; i <=999; i++) 
		{
	
			boolean rs=ispallindrome(i);
			if(rs)
			{
		      count++;
				System.out.println(i);
			}
				
	
		}
		System.out.println("no.of pll: "+count);
		
	}

	private static boolean ispallindrome(int n) 
	{
		int temp=n;
		int rev=0;
		while(n>0)
		{
		int rem=n%10;
	    rev=rev*10+rem;
		n=n/10;
		}
		return temp==rev;
	
	}

}
