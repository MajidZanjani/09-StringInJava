package stringComparesion;

public class StringComparesion {

	public static void main(String[] args) {

		String s1 = "Majid";
		String s2 = "majid";
		String s3 = "Majed";
		String s4 = "Majid";
		String s5 = new String(s1);

		System.out.println("s1.equals(s2) -> " + s1.equals(s2));
		System.out.println("s1.equals(s3) -> " + s1.equals(s3));
		System.out.println("s1.equals(s4) -> " + s1.equals(s4));
		System.out.println("s1.equalsIgnoreCase(s2) -> " + s1.equalsIgnoreCase(s2));
		System.out.println();
		System.out.println("s1 == s4 -> " + (s1 == s4));
		System.out.println("s1 == s5 -> " + (s1 == s5));
		System.out.println();
		System.out.println("s1.compareTo(s2) -> " + s1.compareTo(s2));
		System.out.println("s1.compareToIgnoreCase(s2) -> " + s1.compareToIgnoreCase(s2));
		System.out.println("s1.compareTo(s3) -> " + s1.compareTo(s3));


		
		
	}

}
