
public class MainT2
{
	public static void main(String[] args)
	{
		Thread t1=new Thread();
		System.out.println(t1);
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		  System.out.println("-------------------");
		  t1.setName("rama");
		  t1.setPriority(8);
		  System.out.println(t1.getId());
			System.out.println(t1.getName());
			System.out.println(t1.getPriority()); 
		  
		
		
	}

}
