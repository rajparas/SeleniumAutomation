package Array;

import java.util.*;

public class arrayList3 
{

	public static void main(String[] args)
	{
		//How To Reverse Elements From ArrayList
		
		ArrayList <Integer> al = new ArrayList <Integer>();
		
		al.add(10);
		al.add(49);
		al.add(83);
		al.add(38);
		al.add(10);
		al.add(83);
		al.add(21);
		al.add(49);
		al.add(27);
		al.add(10);
		
		System.out.println(al);
		
		//Collections.frequency(al,10);
		Collections.reverse(al);
		
		System.out.println(al);
		
		LinkedHashSet<Integer> newlist = new LinkedHashSet<Integer>(al); 
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(newlist);
		
		System.out.println("al2: "+newlist);

	}

}
