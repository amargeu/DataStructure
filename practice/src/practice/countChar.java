package practice;

public class countChar
{
	public static void main(String[] args) 
	{
		String str="amar is here to do something";
		char ch[]=str.toCharArray();
		//String st=" ";
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
		System.out.println(st+"----->"+count);
		}
		
	}

}
