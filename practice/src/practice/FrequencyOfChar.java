package practice;

public class FrequencyOfChar 
{
	public static void main(String[] args) {
	String str1="amardeepamardeepAmardepp";
	String str=str1.toUpperCase();
	System.out.println(str1);
	int count[]=new int[26];
	for (int i = 0; i < str.length(); i++)
	{
		char ch=str.charAt(i);
		if(ch>=65&&ch<=90)
			count[ch-65]++;
		else if(ch>=97&&ch<=122)
			count[ch-97]++;
	}
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i]!=0)
				System.out.print((char)(i+65)+""+count[i]);
			
		}
	}
	

}
