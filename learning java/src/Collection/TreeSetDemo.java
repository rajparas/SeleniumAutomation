package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Volleyball");
		ts.add("Football");
		ts.add("Cricket");
		ts.add("Swimming");
		
		Iterator<String> itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
		
		System.out.println("*******************************");
		
		
		Iterator<String> itr1 = ts.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
			
		}
	}

}
