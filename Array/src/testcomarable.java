import java.util.ArrayList;
import java.util.Collections;

public class testcomarable 
{
	
	public static void main(String[] args)
	{
		Movie m1=new Movie(150, 5.5, "abac");
		Movie m2=new Movie(200, 6.95, "cdec");
		Movie m3=new Movie(100, 8.5, "ac");
		Movie m4=new Movie(120, 4.5, "jklc");
		ArrayList<Movie>al=new ArrayList<>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		Collections.sort(al,Collections.reverseOrder());
		for(Movie m:al)
		{
		System.out.println(m.name+" "+m.price+" "+m.rating);
		}
		
		
	}

}
