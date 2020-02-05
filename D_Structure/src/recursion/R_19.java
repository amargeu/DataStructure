package recursion;

public class R_19
{
	public static void main(String[] args)
	{
		int ar[]= {5,8,9,5};
		int s=ArraySum(ar,0,0);
		System.out.println(s);
		
	}

	private static int ArraySum(int[] ar, int sum, int i) 
	{
		if(i>ar.length-1)
			return sum;
		
		sum=sum+ar[i];
		//System.out.print(sum+" ");
		
		return ArraySum(ar,sum,i+1);
	}

}
