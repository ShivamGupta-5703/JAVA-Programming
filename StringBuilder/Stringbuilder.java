package StringBuilder;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();  //bydefault capacity 16
		sb.append("HEY");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1,3));
		//StringBuilder to string -->
		String s = sb.toString();
		//String to StringBuilder -->
		StringBuilder sb1 = new StringBuilder(s);
		
		for(int i=0;i<sb.length();i++) {
			System.out.println(sb.charAt(i));
		}
	}

}
