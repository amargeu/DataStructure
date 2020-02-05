package practice;

//METHOD hiding 
public class Override extends Overload
{

	//@java.lang.Override
	static void area()
	{
		int r=4;
		System.out.println("overridden area "+3.14*r*r);;
	}

	//@java.lang.Override
	 static void area(int a)
	{
		System.out.println("overridden area "+3.14*a*a);;
	}

	//@java.lang.Override
	 static int area(int a, int b) 
	{
		return a*b;
	}
	
	

}
