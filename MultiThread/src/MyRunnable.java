
public class MyRunnable  implements Runnable
{

	@Override
	public void run()
	{
		new Thread(new MyRunnable()).start();
		
	}
	

}
