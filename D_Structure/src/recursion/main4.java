package recursion;

public class main4
{
public static void main(String[] args)
{
	int ar[]=new int[5];
	ar[0]=1;
	ar[1]=1;
	ar[2]=0;
	ar[3]=1;
	ar[4]=1;

	int i=0;
	int count=0;
	while(i<ar.length)
	{
	if(ar[0]!=ar[i])
	{
		int t=ar[i];
		ar[i+1]=ar[i];
		ar[i]=t;
		count++;
	}
	}
	System.out.println(count);


	

	
}
}
