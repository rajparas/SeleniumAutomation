package basic;

import java.util.Arrays;
import java.util.Collections;

public class StringClassProgram {

	public static void main(String[] args) {

		String str = "Tops";
		String str1 = str.concat(" Tech");
		System.out.println(str1);

		// String s = new String("Tech");
		// System.out.println(s);

		String s = "Sun rises in east";
		System.out.println("Replace :" + s.replace("e", "w"));
		System.out.println("Length :" + s.length());

		System.out.println("Index of i :" + s.indexOf("i"));

		System.out.println("Character at 5 :" + s.charAt(5));
		System.out.println("Upper case :" + s.toUpperCase());
		System.out.println("Lower case :" + s.toLowerCase());
		System.out.println("Trim :" + s.trim());
		System.out.println(s);
		System.out.println("***********");

		// Converting word into array

		String strArray[] = str1.split("");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("Converting word into array: " + strArray[i]);
		}

		// Converting character into array

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println("Converting character into array: " + ch[i]);
		}

		// To print reverse array

		String strArray1[] = s.split("");
		Collections.reverse(Arrays.asList(strArray1));
        System.out.println(Arrays.asList(strArray1));
        
        Integer [] intArray = {1, 2, 3, 4, 5};
        Collections.reverse(Arrays.asList(intArray));
        System.out.println(Arrays.asList(intArray));

	}

}
