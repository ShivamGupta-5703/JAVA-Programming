<<<<<<< HEAD
package String;

public class allsubstring_lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "83415";
		print(str);
		

	}
	public static void print(String str) {
		for(int length =1;length<=str.length();length++) {
			for(int j=length;j<=str.length();j++) {
				int i = j-length;
				System.out.print(str.substring(i,j)+" ");
			}
			System.out.println();
		}
	}

}
=======
package String;

public class allsubstring_lengthwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "83415";
		print(str);
		

	}
	public static void print(String str) {
		for(int length =1;length<=str.length();length++) {
			for(int j=length;j<=str.length();j++) {
				int i = j-length;
				System.out.print(str.substring(i,j)+" ");
			}
			System.out.println();
		}
	}

}
>>>>>>> 9265cfa644a9e9f746adec26738ce8d105dde8ba
