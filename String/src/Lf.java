
public class Lf 
{
	public static void main(String[] args) 
	{
     String str="malylam";
     boolean rs=ispallindrome(str);
     if(rs)
    	 System.out.println("pallindrome");
     else
    	 System.out.println("not pallindrome");
	 }
	
     static boolean ispallindrome(String str)
     {
    	
         char ch[]=str.toCharArray();
     for (int i = 0; i < ch.length/2; i++)
     {  
    	 int n=ch.length;
    	 while(ch[i]!=ch[ch.length-1-i])
    	 {
    	  return false;
    	 }
 
	   }
     return true;

  }
}
