package recursion;

public class R17 
{
	public static void main(String[] args) 
	{
		int ar[]= {105,4,89,65,74,2,99};
		System.out.println(ar.length);
		int bg=biggest(ar,ar[0],1);
		System.out.println(bg);
		
	}

	private static int biggest(int[] ar, int big, int i) 
	{
		//System.out.print(big+" ");
		
		if(i>ar.length-1)
		     return big;
		  if(big<ar[i] )
		  {
			big=ar[i];
			//System.out.print(big+"  ");
		  }
		  return biggest(ar,big,i+1);
	}

}
