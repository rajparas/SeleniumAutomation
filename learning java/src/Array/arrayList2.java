package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.*;

public class arrayList2 {

	public static void main(String[] args) {
		// How To Reverse Elements From ArrayList

		ArrayList<String> al = new ArrayList<String>();

		al.add("Java");
		al.add("PHP");
		al.add("Java");
		al.add("Pythone");
		al.add("ASP.NET");
		al.add("PHP");
		al.add("C#");
		al.add("C++");
		al.add("ASP.NET");
		al.add("PHP");

		System.out.println(al);

		Collections.reverse(al);
		System.out.println(al);
		
		LinkedHashSet<String> newlist = new LinkedHashSet<String>(al);
		
		ArrayList<String> al2 = new ArrayList<String>(newlist);
		System.out.println("al2: "+newlist);

	}

}
