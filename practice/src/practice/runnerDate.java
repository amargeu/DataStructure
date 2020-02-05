package practice;

import java.util.Scanner;

public class runnerDate
{
		static Date readDate()
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first date(dd mm yyyy)");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		Date date=new Date(d,m,y);
		return date;
		}
		public static void main(String[] args)
		{
			runnerDate rd=new runnerDate();
			System.out.println("read first date");
			Date d1=readDate();
			System.out.println("read second date");
			Date d2=readDate();
			System.out.println("no. of days b/w "+d1+ " and "+d2 +"is");
			 int dcount=d2.no_of_Days()-d1.no_of_Days();
			System.out.println(dcount);
			String dname= d1.getDays_name();
			String dname1=d2.getDays_name();
		System.out.println(dname);
		System.out.println(dname1);
	

			
				
	
	    }

}
