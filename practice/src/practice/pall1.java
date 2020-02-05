package practice;

public class pall1 
{
	public static void main(String[] args)
	{
		int count=0;
		for (int i = 1; i <=9; i++) 
		{
			for (int j = 0; j <=9; j++)
			{
				count++;
				System.out.println(" "+i+j+j+i);
				
			}
			
		}
		System.out.println("total pallindrome "+count);
		
	}

}
