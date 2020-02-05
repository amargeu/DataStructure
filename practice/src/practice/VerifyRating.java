package practice;

public class VerifyRating 
{
	void verify( int rate)
	{
	 if(rate>2)
		{
			MockException m=new MockException();
			System.out.println(m.getMessage());
			return;
		}
	
	}
	void verify( double per)//method overloading
	{
		if(per<55)
		{
			MockException m1=new MockException();
			System.out.println(m1.toString());
			return;
		}
		else
			System.out.println("good luck for the interview");
	}
	

}
