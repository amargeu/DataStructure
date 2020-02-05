package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class array 
{
	public static void main(String[] args)
	{
	   HashSet<String>al=new HashSet<>();
		al.add("a");
		al.add("c");
		al.add("d");
		al.add("n");
		al.add("n");		//al.add(null);
		al.add("f");
		//al.add(null);
		//al.add(null);
		System.out.println(Collections.min(al));
		//Collections.sort(al,Collections.reverseOrder());
		System.out.print(al);
		
	}

}
