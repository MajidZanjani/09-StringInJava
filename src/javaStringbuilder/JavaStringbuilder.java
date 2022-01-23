package javaStringbuilder;

public class JavaStringbuilder {

	public static void main(String[] args) {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("This is an example of StringBuilder.");
		System.out.println(stringBuilder);
		
		stringBuilder.insert(5, "--");
		System.out.println(stringBuilder);
		
		stringBuilder.replace(4, 6, " ");
		System.out.println(stringBuilder);
		
		stringBuilder.delete(5, 6);
		System.out.println(stringBuilder);
		
		stringBuilder.reverse();
		System.out.println(stringBuilder);

		// As you see many methods in StringBuilder works as the same as StringBuffer.
		// Main deference between these two is StringBuffer is synchronized.
		// But, StringBuilder is none-synchronized.		

	}

}
