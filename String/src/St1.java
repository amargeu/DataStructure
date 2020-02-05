
public class St1
{
public static void main(String[] args) 
{
	int k=1;
	int n =7;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=n;j++)
	{
	 
		System.out.print((char)(64+k)+" ");
		k++;
		if(k==26)
			k=1; 
		
	}
	System.out.println();

}
}
}
