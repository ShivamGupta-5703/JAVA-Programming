
public class GCD {
	public static void main(String[] args) {

		int Divident = 4;
		int Divisor = 8;
		while(Divident%Divisor!=0) {
			int rem= Divident%Divisor;
			Divident=Divisor;
			Divisor=rem;
			}
		System.out.println(Divisor);
		}
			
	}

