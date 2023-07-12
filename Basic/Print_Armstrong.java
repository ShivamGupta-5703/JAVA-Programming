import java.util.Scanner;

public class Print_Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(sum(i)==true) 
			{System.out.print(i+"\t");}
		}
		sc.close();
	}

	public static int count(int num) {
		int count = 0;
		for (int i = num; i > 0; i = i / 10) {
			count++;
		}
		return count;

	}

	public static boolean sum(int num) {
		int c= count(num);
		int sum=0;
		for (int j = num; j > 0; j = j / 10) {
			int rev = j % 10;
			sum += Math.pow(rev, c);
		}
		if(sum!=num) {
			return false;
		}
		return true;
	}

}
