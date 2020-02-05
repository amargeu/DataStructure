
public class Movie implements Comparable<Movie>
{
	int price;
	double rating;
	String name;
	
public  Movie(int p,double r,String n)
	{
this.price=p;
this.name=n;
this.rating=r;
	
		/*this.price=price;
		this.name=name;
		this.rating=rating;*/
	}

	@Override
	public int compareTo(Movie m) 
	{
		return this.price-m.price;
	}
	
	
}
