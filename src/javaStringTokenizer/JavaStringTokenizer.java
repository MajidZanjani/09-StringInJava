package javaStringTokenizer;

import java.util.StringTokenizer;

public class JavaStringTokenizer {

	public static void main(String[] args) {

		StringTokenizer s1 = new StringTokenizer("My name is Majid Zanjani" , " ");
		
		while (s1.hasMoreElements()) {
			System.out.println(s1.nextToken());
		}
		
	}

}
