
public class Mythread2  extends Thread
{
	public void run() 
	{
		for (int i = 0; i <10; i++) 
		{
		System.out.println("thread 2  "+i);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	

}
