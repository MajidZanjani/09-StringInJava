package stringImmutability;

public class StringImmutability {

	public static void main(String[] args) {

		String s1 = "Majid";
		
		s1.concat(" Zanjani"); 			// immutability of string 
		
		System.out.println(s1);
		
		s1 = s1.concat(" Zanjani"); 	// now it's refer to a new object
		
		System.out.println(s1);

	}

}
