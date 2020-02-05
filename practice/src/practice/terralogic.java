package practice;

import java.util.Scanner;

public class terralogic
{
	
	int total=0;
	public  int input(int coins)
	{
		switch(coins)
		{
		case 1: total=total+1;
		        break;
		case 5: total=total+5;
		        break;
		case 10: total=total+25;
		         break;
		case 50: total=total+50;
		          break;
		default: System.out.println("wrong input");
		         return 0;
		}
		
		return 0;
		
	}
	public int select(int choice)
	{
    switch(choice)
    {
    case 1:System.out.println("you selected pepsi(35)");
            total=total-35;
           System.out.println("your remaining change :"+total);
           break;
    case 2:System.out.println("you selected thumshub(30)");
            total=total-30;
            System.out.println("your remaining change :"+total);
            break;
    case 3:System.out.println("you selected coke(33)");
            total=total-33;
            System.out.println("your remaining change :"+total);
            break;
    default: System.out.println("wrong choice");
             break;
    }
    return 0;
	}
	public static void main(String[] args) 
	{
		terralogic tr=new terralogic();
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to vending machine");
	System.out.println("put coins in the denomination of:1,5,10,50");
	int coins=sc.nextInt();
	tr.input(coins);
	System.out.println("select one of the item");
	System.out.println("1.pepsi(35)");
	System.out.println("2.thumshub(30)");
	System.out.println("3.coke(33)");
	int choice=sc.nextInt();
	tr.select(choice);
	}
}
