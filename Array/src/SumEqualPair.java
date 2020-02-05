
public class SumEqualPair
{
	public static void main(String[] args) 
	{
		int ar[]= {1,4,3,10,11,12};
		int sum=23;
		System.out.println("before insertion array arr1 ");
		for (int i = 0; i < ar.length; i++)
		{
		System.out.println(i+"------>"+ar[i]);
		}
		ar=insertArr(ar,sum);
		System.out.println("after insertion of element");
		if(ar==null)
			System.out.println("insertion fail");
		else
		{
			for (int i = 0; i < ar.length; i++) 
			{
				System.out.println(i+"-------->"+ar[i]);
				
			}
		}
		
	}

	 static int[] insertArr(int[] x,int sum)
	 {
		 int e[]= {0,0};
		 for (int i = 0; i < x.length; i++)
		 {
			 for (int j = 0; j < x.length-1; j++)
			 {
		      if(x[i]+x[j+1]==sum)
		       {
			      e[0]=x[i]; 
			      e[1]=x[j+1];
		 }
		 }
		 }
	
		return e;
		
	}

	 }
