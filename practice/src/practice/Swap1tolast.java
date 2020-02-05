package practice;

public class Swap1tolast
{
	public static void main(String[] args)
	{
		String str="amar deep kumar singh";
		char ch[]=str.toCharArray();
		int sin=0,lin;
		for (int i = 0; i < ch.length; i++) 
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')//first char
			{
				sin=i;
			}
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				lin=i;
				char t=ch[sin];
				ch[sin]=ch[lin];
				ch[lin]=t;
			}
		}
		str=new String(ch);
		System.out.println(str);
		
	}

}
