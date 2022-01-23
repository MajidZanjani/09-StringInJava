package javaString;

public class JavaString {

	public static void main(String[] args) {

		char[] c = {'S','t','r','i','n','g','s'};
		String s1 = new String(c);					// Sequence of characters
		
		String s2 = " in ";							// Using literal
		
		String s3 = new String("Java...");			// Using string instance
		
		System.out.println(s1+s2+s3);
		
	}

}
