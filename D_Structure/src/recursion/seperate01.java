package recursion;
public class seperate01
{
	public static void main(String[] args) {
	int a[]= {1,1,0,1,0,1,1,0};
	int l=0,r=a.length-1;
	int count=0;
	while(l<r)
	{
		while(a[l]==0&& l<r)
		{
			l++;
		}
		while(a[r]==1&& l<r)
		{
			r--;
		}
		if(l<r)
		{
		  count++;
			a[l]=0;
			a[r]=1;
			l++;
			r--;
		}
	}
	for (int i = 0; i < a.length; i++)
	{
		System.out.print(a[i]+"  ");
		
	}
	System.out.println();
	System.out.println(count);
	}
}
