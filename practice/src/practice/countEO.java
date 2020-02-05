package practice;

public class countEO 
{
	public static void main(String[] args) 
	{
		int n=8795243;
		int ce=0,co=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
				ce++;
			else
				co++;
			n=n/10;
		}
		System.out.println(ce);
		System.out.println(co);
		
	}

}
