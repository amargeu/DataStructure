package practice;

public class Date 
{
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,30};
	String name[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	public Date(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if (yy%400==0||yy%4==0&&yy%100!=0)
		{
			month[2]=29;	
		}
	}
	public String toString()
	{
		return "["+dd +"/"+ mm +"/"+yy+"]";
	}
	public int no_of_Days()
	{
		int days=dd;
		int y=yy-1;
		days=days+y*365;
		days=days+y/400+y/4-y/100;
		for (int i =1; i <mm; i++) 
		{
			days=days+month[i];
		}
		return days;
	}
	public String getDays_name()
	{
		return name[no_of_Days()%7];
	}

}
