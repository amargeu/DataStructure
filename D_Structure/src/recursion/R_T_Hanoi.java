package recursion;

public class R_T_Hanoi
{
	public static void main(String[] args)
	{
		
	  move('s','t','d',5) ;
	 
		 
	 }

	private static void move(char src, char temp, char dest, int n) 
	{
		
		if(n==1)
		{
			System.out.println(n+" disc move from "+src+" to "+dest);
		return;
		}
		
		move(src,dest,temp,n-1);
		System.out.println(n+" disc move from "+src+" to "+dest);
		
		move(temp,src,dest,n-1);
		
	}

}
