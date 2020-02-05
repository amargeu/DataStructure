
public class ArrayInArrayINser
{
	public static void main(String[] args) 
	{
		int ar1[]= {1,2,3,4,10,11,12};
		int ar2[]= {5,6,7,8,9};
		System.out.println("before insertion array arr1 ");
		for (int i = 0; i < ar1.length; i++)
		{
		System.out.println(i+"------>"+ar1[i]);
		}
		System.out.println("before insertion array arr2 ");
		for (int i = 0; i < ar2.length; i++)
		{
		System.out.println(i+"------>"+ar2[i]);
		}
		ar1=insertArr(ar1,ar2,4);
		System.out.println("after insertion of element");
		if(ar1==null)
			System.out.println("insertion fail");
		else
		{
			for (int i = 0; i < ar1.length; i++) 
			{
				System.out.println(i+"-------->"+ar1[i]);
				
			}
		}
		
	}

	 static int[] insertArr(int[] x, int [] y,int in)
	 {
		if(in<0||in>x.length)
		{
			System.out.println("index out of range");
			return null;
		}
		int narr[]=new int[x.length+y.length];
		for (int i = 0; i < x.length; i++)
		{
			if(i<in)
				narr[i]=x[i];
			else
				narr[i+y.length]=x[i];
		}
		for (int i = 0; i < y.length; i++) 
		{
		narr[in+i]=y[i];	
		}
		return narr;
		
	}


}
