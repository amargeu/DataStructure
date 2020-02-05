package recursion;

public class R13_1
{
	public static void main(String[] args) {
		

		int rs=countdigit(98);
		System.out.println(rs);
		}

		private static int countdigit(int n) 
		{
			if(n<10&&n>-10)
				return 1;
			
			return 1+countdigit(n/10);
		
		}

}
