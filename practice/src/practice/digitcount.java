package practice;

public class digitcount 
{
	public static void main(String[] args)
	{
		int n=757485798;
		int count=0;
		/*do {
			count++;
			n=n/10;
		}while(n!=0);*/
		while(n>0)
		{
			count++;
			n=n/10;
			System.out.println(n);
		}
		System.out.println(count);
		
	}

}
