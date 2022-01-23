package stringConcatenation;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatenation {

	public static void main(String[] args) {

		String s1 = "Majid";
		String s2 = "Ron";
		String s3 = "Ben";
		String s4 = "Susan";
		String s5 = "Mike";
		int a = 20;
		int b = 22;
		
		String result = a + b + "," + s1 + "," + s2 + "," + a + b;
		System.out.println(result);
		
		result = s1.concat(",").concat(s2);
		System.out.println(result);
		
		result = String.join(",", s1,s2,s3,s4,s5);
		System.out.println(result);
		
		StringBuilder s = (new StringBuilder(s1)).append(",").append(s2);
		System.out.println(s);
		
		result = String.format("%s%s%s", s1,",",s2);
		System.out.println(result);

		StringJoiner stringJoiner = new StringJoiner(",");
		stringJoiner.add(s1);
		stringJoiner.add(s2);
		System.out.println(stringJoiner);

		List<String> list = Arrays.asList(s1,s2,s3,s4,s5);
		result = list.stream().collect(Collectors.joining(","));
		System.out.println(result);

	}

}
