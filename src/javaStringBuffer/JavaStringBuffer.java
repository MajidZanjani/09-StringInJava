package javaStringBuffer;

public class JavaStringBuffer {

	public static void main(String[] args) {

		StringBuffer stringBuffer = new StringBuffer("Hello");
		
		stringBuffer.append("World!");		
		System.out.println(stringBuffer);
		
		stringBuffer.insert(5, " ");
		System.out.println(stringBuffer);

		stringBuffer.replace(5, 6, "_");
		System.out.println(stringBuffer);

		stringBuffer.delete(5, 6);
		System.out.println(stringBuffer);

		stringBuffer.reverse();
		System.out.println(stringBuffer);

		stringBuffer = new StringBuffer(); 								// default 16
		System.out.println(stringBuffer.capacity());
		stringBuffer.append("Hello"); 									// still 16
		System.out.println(stringBuffer.capacity());
		stringBuffer.append(" world! This is an example"); 				// (16*2) + 2
		System.out.println(stringBuffer.capacity());
		stringBuffer.append("  to calculate stringbuffer capacity."); 	// (34*2) + 2 ..etc
		System.out.println(stringBuffer.capacity());

		stringBuffer = new StringBuffer();
		System.out.println(stringBuffer.capacity());
		stringBuffer.ensureCapacity(20); // this increase the capacity to the next level (16*2)+2 
		System.out.println(stringBuffer.capacity());		

	}

}
