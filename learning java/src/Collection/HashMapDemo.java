package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(10, "White");
		
		map.put(11, "Black");
		
		map.put(12, "Blue");
		
		map.put(10, "Red");
		// System.out.println(map);
		
		
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
