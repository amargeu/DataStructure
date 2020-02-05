package practice;

public class MockException  extends RuntimeException
{
 
public String getMessage()
   {
	 return "sorry you have less mock rating not eligible for drive";  
    }
 
	public String toString() {
		return "sorry u are not eligible for this drive u have less marks";
	}
   
}
