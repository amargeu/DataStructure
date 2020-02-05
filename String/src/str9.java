import java.util.Scanner;

public class str9 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter sentence");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			int count=0;
			String st=" ";
			while(i<ch.length&&ch[i]!=' ')
			{
				st=st+ch[i];
				count++;
				i++;
			}
			if(st.length()>0)
			System.out.print(st+"----->"+count+"  ");
		}
	}
}
		
