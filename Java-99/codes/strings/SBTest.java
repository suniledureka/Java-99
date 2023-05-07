package co.edureka.java.strings;

public class SBTest {

	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb + " | size= "+sb.length() + " | capacity= "+sb.capacity());
		
		sb.append("edureka limited");
		System.out.println(sb + " | size= "+sb.length() + " | capacity= "+sb.capacity());
		
		sb.append(" .");
		System.out.println(sb + " | size= "+sb.length() + " | capacity= "+sb.capacity());
		
		sb.insert(0, "** ");
		System.out.println(sb + " | size= "+sb.length() + " | capacity= "+sb.capacity());
		
		sb.reverse();
		System.out.println(sb);
	}
}
