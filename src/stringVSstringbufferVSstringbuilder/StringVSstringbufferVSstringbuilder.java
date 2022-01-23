package stringVSstringbufferVSstringbuilder;

import java.sql.Time;

public class StringVSstringbufferVSstringbuilder {

	public static String stringConcat() {
		String string = "Sample";
		System.out.println("String HashCode before concat: " + string.hashCode());
		for (int i = 0; i < 100000; i++) {
			string = string + "String";
		}
		System.out.println("String HashCode after concat:  " + string.hashCode());
		return string;
	}
	
	public static StringBuffer stringBufferConcat() {
		StringBuffer stringBuffer = new StringBuffer("Sample");
		System.out.println("StringBuffer HashCode before concat: " + stringBuffer.hashCode());
		for (int i = 0; i < 100000; i++) {
			stringBuffer.append("String");
		}
		System.out.println("StringBuffer HashCode after concat:  " + stringBuffer.hashCode());
		return stringBuffer;
	}
	
	public static StringBuilder stringBuilderConcat() {
		StringBuilder stringBuilder = new StringBuilder("Sample");
		System.out.println("StringBuilder HashCode before concat: " + stringBuilder.hashCode());
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append("String");
		}
		System.out.println("StringBuilder HashCode after concat:  " + stringBuilder.hashCode());
		return stringBuilder;
	}	
	
	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		stringConcat();
		System.out.println("Time to concat 100000 strings by StringConcat = " + (System.currentTimeMillis() - startTime));
		
		startTime = System.currentTimeMillis();
		stringBufferConcat();
		System.out.println("Time to concat 100000 strings by StringBufferConcat = " + (System.currentTimeMillis() - startTime));

		startTime = System.currentTimeMillis();
		stringBuilderConcat();
		System.out.println("Time to concat 100000 strings by StringBuilderConcat = " + (System.currentTimeMillis() - startTime));		
	}

}
