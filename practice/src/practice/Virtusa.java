package practice;
import java.util.ArrayList;
import java.util.List;

public class Virtusa 
{
	public static void main(String[] args)
	{
		List<String>a=new ArrayList();
		a.add("amargeu");
		List<String>b=new ArrayList();
		b.add("amar");
		check(a,b);
		
	}

	private static void check(List<String> a, List<String> b) 
	{
		
	if(a.contains(b))
		System.out.println("yes");
	else
		System.out.println("no");
	}
}
