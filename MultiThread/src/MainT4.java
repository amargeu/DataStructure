
public class MainT4 
{
	public static void main(String[] args) 
	{
		System.out.println("mms");
		Sample s=new Sample();
		class Dthread extends Thread
		{
			public void run()
			{
				s.display();
			}
		}
		class Pthread extends Thread
		{
			public void run()
			{
				s.print();
			}
		}
		Thread dt=new Dthread();
		dt.start();
		Thread pt=new Pthread();
		pt.start();
		System.out.println("mme");
	}

}
