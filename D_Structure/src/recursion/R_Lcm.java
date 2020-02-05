package recursion;

public class R_Lcm
{
	public static void main(String[] args)
	{
		int lm=lcm(14,7,7);// lcm is gretter than 
		System.out.println(lm);
				
		
	}

	private static int lcm(int m, int n, int prod) //my extension biggest element in "n"
	{
		if(m>n)
			return lcm(n,m,m);
		
		if(prod%m==0)
			return prod;
		return lcm(m,n,prod+n);
	}

}
