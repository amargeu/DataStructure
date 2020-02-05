
public class DDcalRunner 
{
	public static void main(String[] args)
	{
		DDCalMat mt=new DDCalMat();
		System.out.println("enter 1 st matrix");
		int x[][]=mt.readMat();
		/*System.out.println("enter 2 nd matrix");
		int y[][]=mt.readMat();*/
		System.out.println("display 1 matrix");
		mt.dispMat(x);
		/*System.out.println("display 2nd matrix");
		mt.dispMat(y);
		int z[][]=mt.add(x, y);
		if(z==null)
			System.out.println("order mismatched");
		else
		{
			System.out.println("display added matrix");
		  mt.dispMat(z);
		}*/
		/* int trans[][]=mt.trsnMat(x);
		System.out.println("display transpose of 1st matrix");
		mt.dispMat(trans);*/
		/*int big=mt.getbiggest(x);
		System.out.println("biggest element in matrix is"+big);
		int small=mt.getSmallest(x);
		System.out.println("smallest element in matrix is"+small);*/
		/*int count[]=mt.countEo(x);
		for (int i = 0; i < count.length; i++) 
		{
		System.out.println("no. of even:"+count[i]);
		}*/
		int sum=mt.sumMat(x);
		System.out.println("sum of total element in matrix:"+sum);
		
	}

}
