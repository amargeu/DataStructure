package practice;

public class reverseword 
{
	public static void main(String[] args) {
		String str="java program";
		String word[]=str.split(" ");
		String rev=" ";
		for (int i = 0; i < word.length; i++)
		{
			System.out.println(word[i]+"------"+i);
			String str1=word[i];
			for (int j =str1.length()-1;j>=0; j--)
			{
				rev=rev+str1.charAt(j);
				
			}
			rev=rev+" ";
			System.out.println(rev);
			
			
		}
		
	}

}
