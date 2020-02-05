package practice;

public class reverse_sentence 
{
	public static void main(String[] args) 
	{
	String str="amardeep is learning java from jspider";
	String word[]=str.split(" ");
	for (int i =word.length-1; i>=0; i--)
	{
		System.out.print(word[i]+" ");
		
	}
	}
}
