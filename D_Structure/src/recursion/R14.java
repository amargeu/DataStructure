package recursion;

public class R14 
{
	public static void main(String[] args) 
	{
		boolean rs=ispallindrome(4552,0,4554);
		System.out.println(rs);
		
	}

	private static boolean ispallindrome(int n, int rev, int temp) 
	{
		if(n==0)
			return rev==temp;
		rev=rev*10+n%10;
		return ispallindrome(n/10, rev, temp);
	}

}
