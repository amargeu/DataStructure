package recursion;

public class R_Gcd 
{
	public static void main(String[] args)
	{
		int Gc=gcd(45,15);
				System.out.println(Gc);
		
	}

	private static int gcd(int a, int b) //i want biggest no. in "a"
	{
		if(b>a)
			return gcd(b,a);
		if(a%b==0)
			return b;
		return gcd(b,a%b);
	}

}
