package recursion;

public class R12_1 
{
	public static void main(String[] args) 
	{
		int s=sumdigit(4523,0);//only for +ve n
		System.out.println(s);
		
	}

	private static int sumdigit(int n,int sum) 
	{
	
	    sum=sum+n%10;
		if(n==0)
			return sum;
		
		
		return  sumdigit(n/10,sum);
	}

}
