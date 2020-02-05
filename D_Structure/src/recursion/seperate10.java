package recursion;
public class seperate10
{
	public static void main(String[] args) {
	int a[]= {1,1,0,1,0,1,1,0};
	int l=0,r=a.length-1;
	int count=0;
	while(l<r)
	{
		while(a[l]==1&& l<r)
		{
			l++;
		}
		while(a[r]==0&& l<r)
		{
			r--;
		}
		if(l<r)
		{
		  count++;
			a[l]=1;
			a[r]=0;
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
