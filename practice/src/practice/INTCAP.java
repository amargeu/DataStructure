package practice;

public class INTCAP 
{
	public static void main(String[] args) 
	{
	String str="aMaR dEeP KumAr";
	char ch[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++) 
	{
		if(i==0&& ch[i]!=' '|| ch[i]!=0&&ch[i-1]==' ')//first char
		{
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char) (ch[i]-32);
		}
		else if(ch[i]>='A'&&ch[i]<'Z')
			ch[i]=(char) (ch[i]+32);
		
		
	}
	str=new String(ch);
	System.out.println(str);
		
	}

}
