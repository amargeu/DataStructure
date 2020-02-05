package practice;

public class this__Super extends Super
{
	int r=4;
	void area()
	{
		this.area(10);	
	System.out.println("area of circle " +3.14*r*r);
	super.sum();
	}
     void area(int a)
	{
		System.out.println("area of circle overladed "+3.14*a*a);
	}
     public static void main(String[] args) 
     {
    	 this__Super s=new this__Super();
    	 s.area();
		
	}

}
