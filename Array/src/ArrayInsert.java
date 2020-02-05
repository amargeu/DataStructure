
public class ArrayInsert 
{
	public static void main(String[] args) 
	{
		int ar[]= {4,5,14,48,56,6};
		System.out.println("before insertion array ");
		for (int i = 0; i < ar.length; i++)
		{
		System.out.println(i+"------>"+ar[i]);
		}
		ar=insertArr(ar,89,4);
		System.out.println("after insertion of element");
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

	 static int[] insertArr(int[] x, int ele,int in)
	 {
		if(in<0||in>x.length)
		{
			System.out.println("index out of range");
			return null;
		}
		int narr[]=new int[x.length+1];
		for (int i = 0; i < x.length; i++)
		{
			if(i<in)
				narr[i]=x[i];
			else
				narr[i+1]=x[i];
		}
		narr[in]=ele;
		return narr;
		
	}


}
