
public class ArrayDelete
{
	public static void main(String[] args) 
	{
		int ar[]= {4,5,14,48,56,6};
		System.out.println("before deletion array ");
		for (int i = 0; i < ar.length; i++)
		{
		System.out.println(i+"------>"+ar[i]);
		}
		ar=deleteArr(ar,2);
		System.out.println();
		if(ar==null)
			System.out.println("deletion fail");
		else
		{
			for (int i = 0; i < ar.length; i++) 
			{
				System.out.println(i+"-------->"+ar[i]);
				
			}
		}
		
	}

	 static int[] deleteArr(int[] x, int in)
	 {
		if(in<0||in>x.length)
		{
			System.out.println("index out of range");
			return null;
		}
		int narr[]=new int[x.length-1];
		for (int i = 0; i < x.length-1; i++)
		{
			if(i<in)
				narr[i]=x[i];
			else
				narr[i]=x[i+1];
		}
		return narr;
		
	}

}
