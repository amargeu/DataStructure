package recursion;

public class R_20 
{
	public static void main(String[] args)
	{
		int ar[]= {9,10,16,20,56,58,59,95,100};
		int in=binarySearch(ar,0,ar.length-1,200);
		System.out.println(in);
		
	}

	private static int binarySearch(int[] ar, int f, int l, int ele) 
	{
		if(f>l)
			return -1;
		int mid=(f+l)/2;
      
		if(ar[mid]==ele)
			return mid;
		
		if(ar[mid]<ele)
			f=mid+1;
		else 
			l=mid-1;
		
		return binarySearch(ar, f, l, ele);
	}

}
