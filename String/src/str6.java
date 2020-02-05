import java.util.Scanner;

public class str6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("pls enter sentence");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if (i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') //first character of the word
			  {
				if (ch[i]>='A'&&ch[i]<='Z')
				{
				ch[i]=(char) (ch[i]+32);	
				} 
			  }
		
				else if (ch[i]>='a'&& ch[i]<='z')
				{
					ch[i]=(char) (ch[i]-32);
				}
				
			
		}
		str=new String(ch);
		System.out.println(str);
		
		
	}
}
