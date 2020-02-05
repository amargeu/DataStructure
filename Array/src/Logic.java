
public class Logic 
{
	public static void main(String[] args) 
	{
	int a[]= {4,8,10,12,18};
	int b[]= {5,6,15,20,22,25,27};
	int c[]=smerge(a,b);
	for (int i = 0; i < c.length; i++)
	{
	System.out.println("result"+c[i]);	
	}
	}

 static int[] smerge(int[] a,int b[]) 
 {
	 int c[]=new int[a.length+b.length];
	 int i=0,j=0,k=0;
   while(i<a.length && j<b.length)
   {
	 if(a[i]<b[j])
	 {
		 c[k++]=a[i++];
		
	 }
	 else
	 {
		 c[k++]=b[j++];
	 }
	     
	}
   while(i<a.length) 
   {
	 c[k++]=a[i++];  
   }
   while(j<b.length)
   {
	 c[k++]=b[j++];  
   }
		return c;
	}
	  
}
