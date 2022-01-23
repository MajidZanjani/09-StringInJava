package stringMethods;

import java.util.Iterator;

public class StringMethods {

	static void splitByDash(String s) {
		for (String string: s.split("-")) {
			System.out.println(string);
		}		
	}
	
	public static void main(String[] args) {
		
		String s1 = "MAJID Zanjani";
		System.out.println(s1);
		
		String s2 = s1.toLowerCase();
		System.out.println(s2);

		String s3 = s2.toUpperCase();
		System.out.println(s3);
		
		String s4 = " " + s1 + " ";
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println("---------------------------------\n");
		
		System.out.println(s1.startsWith("MAJ"));
		System.out.println(s1.endsWith("ni"));
		System.out.println(s4.endsWith("ni")); // false, because s4 ends with "ni "
		System.out.println("---------------------------------\n");

		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.intern());

		int x = 20;
		System.out.println(String.valueOf(x));

		String s5 = s4.replace(" ", "_");
		System.out.println(s5);
		
		String s6 = String.join("-", "A","B","C","D",null, s1);
		System.out.println(s6);
		System.out.println("---------------------------------\n");

		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.lastIndexOf("a",9));
		System.out.println("---------------------------------\n");

		splitByDash(s6);
		System.out.println("---------------------------------\n");

	}

}
