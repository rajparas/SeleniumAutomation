package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		
		al.add("Java");
		al.add("Testing");
		al.add(50);
		al.add(20);
		al.add(55.25);
		
		al.add('a');
		al.add(null);
		
		al.remove(3);
		
		al.set(3, "Tops");
		al.add(1, 5000);
		
		System.out.println("Size of array :"+al.size());
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
