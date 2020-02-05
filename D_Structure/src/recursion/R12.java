package recursion;

public class R12 
{
	public static void main(String[] args) 
	{
		int s=sumdigit(52);
		System.out.println(s);
		
	}

	private static int sumdigit(int n) 
	{
		if(n<10 &&n>-10)
			return n;
		
		return  n%10+sumdigit(n/10);
	}

}
