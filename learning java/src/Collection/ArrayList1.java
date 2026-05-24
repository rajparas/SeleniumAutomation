package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al1 = new ArrayList<>();
		
		
		al1.add("Java");
		al1.add("Php");
		al1.add("Python");
		
		
		
		ArrayList<String> al2 = new ArrayList<>(al1);
		
		al2.add("Cricket");
		al2.add("Football");
		al2.add("Volleyball");
		al2.addAll(al1);
		
		
		
		Iterator<String> itr = al2.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
