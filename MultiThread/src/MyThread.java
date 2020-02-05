
public class MyThread extends Thread
{
 void display()
{
	for (char i = 'A'; i < 'Z'; i++)
	{
		System.out.println(i+" ");
		if(i=='F')
		{
			try 
			{
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
 void print()
 {
	for (char i = 'a'; i < 'z'; i++)
	{
		System.out.println(i+" ");
	} 
 }
 public static void main(String[] args) 
 {
	System.out.println("mms");
	MyThread mt=new MyThread();
	mt.display();
	mt.print();
			}

}
