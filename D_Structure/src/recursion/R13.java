package recursion;

public class R13 
{
	public static void main(String[] args) {
		

	int rs=countdigit(5025,0);
	System.out.println(rs);
	}

	private static int countdigit(int n, int count) 
	{
		if(n<=0)
			return count;
		count++;
		return countdigit(n/10,count);
	
	}

}
