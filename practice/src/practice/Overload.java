package practice;

public class Overload 
{

	int r=4;
	 static void area()
	{
		 int r=4;
		System.out.println("area of circle " +3.14*r*r);
	}
	 static void area(int a)
	{
		System.out.println("area of circle overladed "+3.14*a*a);
	}
	 static int area(int a,int b)
	{
		return a*b;
	}
	public static void main(String[] args)
	{
		Overload d=new Override();//upcasting
		d.area();
		d.area(10);
		System.out.println("Area of rectangle "+d.area(5, 6));
		
		
		
	}
	

}
