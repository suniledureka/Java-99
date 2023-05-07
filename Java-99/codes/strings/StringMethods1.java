package co.edureka.java.strings;

public class StringMethods1 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		//String s2 = new String("Java");
		String s2 = new String("java");
		
		System.out.println(("s1==s2 ----> " + (s1==s2)));
		System.out.println("equals() ----> " + s1.equals(s2));
		System.out.println("contentEquals() ----> " + s1.contentEquals(s2));
		System.out.println("equalsIgnoreCase() ----> " + s1.equalsIgnoreCase(s2));
	}

}
