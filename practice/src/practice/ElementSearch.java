package practice;

public class ElementSearch
{
	public static void main(String[] args)
	{
		int ar[]= {10,25,30,56,85,96};
		search(ar,10,30);
		
	}

	private static void search(int[] ar, int a, int b)
	{
		for (int i = 0; i < ar.length; i++) 
		{
			while(i<ar.length-1)
			{
			if(a==ar[i]||b==ar[i])
			{
			System.out.println("BINGO");
			//return;
			}
			i++;
			}
				
		}
		
	}

}
