
public class MainT3
{
public static void main(String[] args) 
{
	System.out.println("MMS");
	Mythread1 t1=new Mythread1();
	Mythread2 t2=new Mythread2();
	t1.start();
	t2.start();

	System.out.println("mme");
	
}

}
