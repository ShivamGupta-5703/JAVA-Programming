
public class LCM {

	public static void main(String[] args) {
		int n1=4;
		int n2=6;
		for(int i = Math.max(n1, n2);i<=n1*n2;i++) {
			if(i%n1==0 && i%n2==0) {
				System.out.println("LCM = "+i);
				break;
			}
		}

	}

}
