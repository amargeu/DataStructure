
public class shape 
{
	public static  class superclass
	{
	  void area()
	{
		System.out.println("sup area");
	}
	public static class subclass extends superclass
	{
	 static void area(int a)
		{
			System.out.println("sub area");
		}
	}
	public static void main(String[] args) 
	{
	//superclass a=new superclass();
	//subclass b=new subclass();
		area();//sup area
	    area();//sub area
		
	}
	
}
}
