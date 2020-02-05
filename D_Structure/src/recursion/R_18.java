package recursion;

public class R_18
{
	public static void main(String[] args)
	{
		int n=9;
		print(n,1);
		
	}

	private static void print(int n, int i)
	{
      System.out.print(i+" ");
      if(n>i)
    	  print(n-1,i+1);
      if(n>i)
    	  System.out.print(i+" ");
	}

}
