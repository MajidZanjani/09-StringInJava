package javaSubstring;

public class JavaSubstring {

	public static void main(String[] args) {

		String s1 = "This is an example for substring in Java.";
		
		System.out.println(s1.substring(8));
		System.out.println(s1.substring(8,18));
		
		String s2 = "Majid, Ron, Ben, Susan, Mike";
		String[] s3 = s2.split("\\,");
		System.out.println(s3[2]);

	}

}
