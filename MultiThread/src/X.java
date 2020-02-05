
public class X  implements Runnable
{
	public static void main(String[] args) 
	{
		//X r=new X();
		//Thread t=new Thread(new X());
	//	t.start();
		Thread t1=new Thread(new X());
		t1.start();
		
	}

	@Override
	public void run() 
	{
		System.out.println("thread running");
		
	}

}
