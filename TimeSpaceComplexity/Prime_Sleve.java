package TimeSpaceComplexity;

public class Prime_Sleve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		PrimeSleve(n);
		

	}
	public static void PrimeSleve(int n) {
		//1. Create array of size n+1
		boolean prime[] = new boolean[n+1];
		
		//2. Since default is false , and we want to assume all numbers from 2 to n as prime so fill it will true.
		for(int i=2;i<prime.length;i++) {
			prime[i]=true;
			//true - prime, false - not prime
		}
		
		//3. Check from 2 to sqrt(n),and remove mulitple of checked number
		for(int i=2;i*i<prime.length;i++) {  // i^2<n+1 
			if(prime[i]==true) { 
				//i is prime, mark its multiple as false.
				for(int j=2;j*i< prime.length;j++) {
					prime[j*i]=false;
				}
			}
		}
		//4. print prime number
		for(int i=2;i<prime.length;i++) {
			if(prime[i]==true) {
				System.out.print(i+" ");
			}
		}
	}

}
