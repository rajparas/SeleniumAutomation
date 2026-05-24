package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		
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
