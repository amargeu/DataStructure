
public class Sample
{
	 void display()
	 {
	 	for (char i = 'A'; i < 'Z'; i++)
	 	{
	 		System.out.print(i+" ");
	 		if(i<'F')
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
	 		System.out.print(i+" ");
	 	} 
	  }

}
