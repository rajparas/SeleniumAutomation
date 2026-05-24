package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> set = new HashSet<>();
		
		
		set.add("Java");
		set.add("Python");
		set.add("Php");
		set.add("C#");
		set.add("Java");
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
				
		                                                           
		
	}

}
